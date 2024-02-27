package Ejercicio3_2;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Marta", "C");
        System.out.println(p.getName());
        System.out.println(p.getAddress());
        p.setAddress("B");
        System.out.println(p.getAddress());

        Staff s = new Staff("Marta", "C", "UAH", 100);
        System.out.println(s.getPay());
        System.out.println(s.getSchool());
        System.out.println(s.getAddress());
        s.setPay(43);
        s.setSchool("PL");
        s.setAddress("B");
        System.out.println(s.getPay());
        System.out.println(s.getSchool());
        System.out.println(s.getAddress());
        Student st = new Student("Marta", "C", "A", 2024, 12);
        System.out.println(st.getFee());
        System.out.println(st.getProgram());
        System.out.println(st.getAddress());
        System.out.println(st.getYear());
        System.out.println(st.getName());
        st.setFee(13);
        st.setProgram("B");
        st.setYear(2025);
        st.setAddress("B");
        System.out.println(st.getFee());
        System.out.println(st.getProgram());
        System.out.println(st.getAddress());
        System.out.println(st.getYear());
    }
}
