/*
 * Decompiled with CFR 0.152.
 */
package JinRyuu.JRMCore.manager;

import JinRyuu.JRMCore.manager.Attribute;

public class AttributeArray {
    public int currentID = 0;
    public Attribute[] attributes;
    public float lastValue;
    public boolean hasEnded = false;

    public AttributeArray() {
    }

    public AttributeArray(float ... attributes) {
        this();
        this.attributes = new Attribute[attributes.length / 2];
        for (int i = 0; i < attributes.length; i += 2) {
            this.attributes[i / 2] = new Attribute(attributes[i], attributes[i + 1]);
        }
    }

    public AttributeArray(Attribute ... attributes) {
        this();
        this.attributes = new Attribute[attributes.length];
        System.arraycopy(attributes, 0, this.attributes, 0, attributes.length);
    }

    public void update(float age) {
        if (!this.hasEnded) {
            int n = this.currentID + 1 == this.attributes.length ? 0 : 1;
            if (age >= this.attributes[this.currentID + n].time) {
                if (this.currentID + 1 == this.attributes.length) {
                    this.hasEnded = true;
                    if (age > this.attributes[this.currentID].time) {
                        age = this.attributes[this.currentID].time;
                    }
                }
                if (this.currentID + 1 != this.attributes.length) {
                    ++this.currentID;
                }
            }
            this.updateValue(age);
        }
    }

    public void updateValue(float age) {
        float currentValue;
        if (this.currentID + 1 == this.attributes.length) {
            currentValue = this.attributes[this.currentID].value;
        } else {
            float maxValue = this.attributes[this.currentID + 1].value;
            float minTime = this.attributes[this.currentID].time;
            float minValue = this.attributes[this.currentID].value;
            float differenceValue = maxValue - minValue;
            float maxTime = this.attributes[this.currentID + 1].time;
            float differenceTime = maxTime - minTime;
            float onePerTime = differenceValue / differenceTime;
            currentValue = (age - minTime) * onePerTime + this.attributes[this.currentID].value;
            if (maxValue > currentValue) {
                if (currentValue > maxValue) {
                    currentValue = maxValue;
                }
            } else if (currentValue < maxValue) {
                currentValue = maxValue;
            }
        }
        this.lastValue = currentValue;
    }
}

