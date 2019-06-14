package com.dimple.effectiveJava.chapter9;

/**
 * @className: Item61
 * @description: 基本类型优于装箱基本类型
 * Java的类型系统由两部分组成：基本类型、引用类型
 * 自动装箱和自动拆箱模糊了但没有完全抹去基本类型和装箱基本类型的区别。
 * 基本类型和装箱基本类型有以下区别：
 * 1. 基本类型只有值，而装箱基本类型则具有与他们的值不同的同一性。
 * 2. 基本类型只有函数值、而每个装箱基本类型都有一个非函数值、除了对应的值以外，还有一个null。
 * 3. 基本类型比装箱基本类型更加节约空间。
 * <p>
 * 对装箱基本类型使用==总是错误的。当在一项操作中混合使用基本类型和装箱基本类型的时候，装箱基本类型就会自动拆箱。如果null对象本自动拆箱，就会抛出NPE
 * @auther: Dimple
 * @date: 06/14/19
 * @version: 1.0
 */
public class Item61 {
}
