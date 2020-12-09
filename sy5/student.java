package sy5;

public class student {
         int number;
         String cclass;
         String sex;
         String name;
         int age;

         public void setGraduate(String cclass,String name, String sex,int age,int number) {
             this.cclass = cclass;
        	 this.sex = sex;
             this.age = age;
             this.name = name;
             this.number = number;
         }
         public String toString () {
             return "班级："+ cclass+"   姓名："+name+"   性别："+sex+"   年龄："+age+"   学号："+number+"\n";
         }
     }

