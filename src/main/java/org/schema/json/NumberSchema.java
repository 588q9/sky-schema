package org.schema.json;

import org.schema.json.base.Schema;

/**
 * @author yangcong
 *
 * 数字描述器
 */
public class NumberSchema extends Schema {

    /**
     * 对当前字段的描述
     */
    private String desc;

    private Number[] enumVal;

    /**
     * 允许的最小值
     */
    private Number min = null;

    /**
     * 允许的最大值
     */
    private Number max = null;

    /**
     * 描述
     *
     * @param desc
     * @return
     */
    public NumberSchema desc(String desc){
        this.desc = desc;
        return this;
    }

    /**
     * 设置key
     * @param enumVal 允许的枚举值范围(不填默认为NULL, 表示只校验是否为数字)
     * @return
     */
    public NumberSchema enumVal(Number ... enumVal){
        this.enumVal = enumVal;
        return this;
    }

    /**
     * 最小值
     * @param min
     * @return
     */
    public NumberSchema min(Number min){
        this.min = min;
        return this;
    }

    /**
     * 最大值
     *
     * @param max
     * @return
     */
    public NumberSchema max(Number max){
        this.max = max;
        return this;
    }

    public String getDesc() {
        return desc;
    }

    public Number[] getEnumVal() {
        return enumVal;
    }

    public Number getMin() {
        return min;
    }

    public Number getMax() {
        return max;
    }

}
