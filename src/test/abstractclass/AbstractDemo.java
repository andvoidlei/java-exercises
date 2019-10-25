package test.abstractclass;

public class AbstractDemo {

    public static void main(String [] args)
    {
        /* 以下是不允许的，会引发错误 */
        //Employee e = new Employee("George W.", "Houston, TX", 43);

        System.out.println("\n Call mailCheck using Employee reference--");
        //e.mailCheck();

        /** 以下是不允许的，会引发错误
         * 尽管我们不能实例化一个 Employee 类的对象，但是如果我们实例化一个 Salary 类对象，
         * 该对象将从 Employee 类继承 7 个成员方法，且通过该方法可以设置或获取三个成员变量。**/

        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("-- Call mailCheck using Salary reference ");
        s.mailCheck();
        /**抽象类的非抽象方法可以不被覆写
         * abstract方法必须覆写**/
        s.computePay1();


        System.out.println("\n -- Call mailCheck using Employee reference");
        e.mailCheck();
        e.computePay();

    }

}
