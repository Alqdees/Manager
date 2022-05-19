package com.company;

import java.util.Scanner;

public class Tools extends Teacher {

    private static Scanner scan = new Scanner(System.in);
    private static String [] menu;
    private static short List_number;
    Teacher teacher;

    public void teachers(){
        teacher = new Teacher();

        menu = new String[]{
                "1 - قائمة المحاضر",
                " 2- قائمة المواعيد",
                "3 - التقارير",
                "4 - الخروج "};
        for (int i = 0;i <menu.length;i++){
            System.out.println(menu[i]);
        }
        System.out.println("أختار رقم أحد القوائم");
        List_number = scan.nextShort();
        if(List_number == 1){
            teacher= new Teacher();
            String [] teacherList = new String[]{
                    "1 - أضافة مدرس" ,
                    "2 - حذف مدرس",
                    "3 - عرض المدرسين",
                    "4 - العودة الى الرئيسية",
            };
            for (int i =0 ;i<teacherList.length ; i++){
                System.out.println(teacherList[i]);
            }
            System.out.println("أدخل اختيارك");
            short listNumber = scan.nextShort();
            switch (listNumber){
                case 1:
                    String TeachersName = scan.next();
                    String TeachersDepartment = scan.next();
                    String teacherId = scan.next();
                    teacher.add(teacherId,TeachersName,TeachersDepartment);
                    break;
                case 2:
                    String Teacher_Name_Remove = scan.next();
                    teacher.remove(Teacher_Name_Remove);
                    break;
                case 3:
                    teacher.teacherView();
                    break;
                case 4:
                    teachers();
                default:
                    System.out.println(" _____Input Error_____");
                    break;
            }




        }else if (List_number == 2 )
        {
            String id = scan.next();
            String name = scan.next();
            teacher.searchTeacher(id,name);
            String [] array = new String[]{
                    "1 - أضافة موعد",
                    "2 - حذف موعد",
                    "3 - تغيير موعد",
                    "4 - تأجيل موعد"

            };
            for (String s : array) {
                System.out.println(s);
            }
            System.out.println("أدخل احد الارقام");
            short index = scan.nextShort();
            switch (index)
            {
                case 1:
                    id = scan.next();
                    name = scan.next();
                    teacher.addSession(id,name);
                    break;
                case 2:
                    id = scan.next();
                    teacher.deleteSession(id);
                    break;
                case 3:
                    id =scan.next();
                    name =scan.next();
                    teacher.editSession(id,name);

//                    System.out.println("bad Entry");
                    break;
            }
        }
        else if (List_number == 3){

        }
    }

}
