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
             return "�༶��"+ cclass+"   ������"+name+"   �Ա�"+sex+"   ���䣺"+age+"   ѧ�ţ�"+number+"\n";
         }
     }

