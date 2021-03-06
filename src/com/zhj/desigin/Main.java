package com.zhj.desigin;

import com.zhj.desigin.ActionModel.strategy.StrategyTest;
import com.zhj.desigin.ActionModel.template.TemplateTest;
import com.zhj.desigin.CreateModel.builder.Compute;
import com.zhj.desigin.CreateModel.builder.CustomerBuilder;
import com.zhj.desigin.CreateModel.factory.FactoryMethod.Factory;
import com.zhj.desigin.CreateModel.factory.FactoryMethod.NokiaFactory;
import com.zhj.desigin.CreateModel.factory.Phone;
import com.zhj.desigin.CreateModel.factory.NormalFactory.PhoneFactory;
import com.zhj.desigin.CreateModel.factory.NormalFactory.PhoneFactory2;
import com.zhj.desigin.CreateModel.factory.NormalFactory.PhoneFactory3;
import com.zhj.desigin.CreateModel.prototype.BookTest;
import com.zhj.desigin.CreateModel.singleton.Singleton;
import com.zhj.desigin.StructureModel.adapter.classAdapter.ClassAdapterTest;
import com.zhj.desigin.StructureModel.adapter.objectAdapter.ObjectVoltAdapterTest;
import com.zhj.desigin.StructureModel.composite.Client;

/**
 * Created by zhanghongjun on 16/10/17.
 */
public class Main {
    public static void main(String[] args){

//       testNormalFactory();
//        testNormalFactory2();
//        testNormalFactory3();
//        testFactoryMethod();


//        testSingleton();
//        testBuilder();
//        testPrototype();
//        testComposite();

//        testClassAdapter();
//        testObjectAdapter();

//        testStrategy();
        testTemplate();
    }

    //测试普通工厂模式
    private static void testNormalFactory(){
        PhoneFactory phoneFactory = new PhoneFactory();
        Phone phone = phoneFactory.produce("xiaomi");
        phone.call();
    }

    //测试普通工厂模式改进
    private static void testNormalFactory2(){
        PhoneFactory2 phoneFactory = new PhoneFactory2();
        Phone phone = phoneFactory.produceNokia();
        phone.call();
    }

    //测试普通工厂模式之静态工厂模式
    private static void testNormalFactory3(){
        Phone phone = PhoneFactory3.produceSanug();
        phone.call();
    }

    //测试工厂方法模式
    private static void testFactoryMethod(){
        Factory factory = new NokiaFactory();
        Phone phone = factory.produce();
        phone.call();
    }

    //测试单例类
    private static void testSingleton(){
        Singleton.getInstance().show();
    }

    //测试建造者模式
    private static void testBuilder(){
        Compute compute = new CustomerBuilder().setMEM("8G").setHDD("西部数据500G").setCPU("i7").build();
        System.out.println(compute);
    }

    //测试原型模式
    private static void testPrototype(){
        try {
            BookTest.test();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    //测试组合模式
    private static void testComposite(){
        Client.test();
    }

    //测试类适配器模式
    private static void testClassAdapter(){
        ClassAdapterTest.test();
    }

    //测试对象适配器模式
    private static void testObjectAdapter(){
        ObjectVoltAdapterTest.test();
    }

    //测试策略模式
    private static void testStrategy(){
        StrategyTest.test();
    }

    //测试模板模式
    private static void testTemplate(){
        TemplateTest.test();
    }


}
