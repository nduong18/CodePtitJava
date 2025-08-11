package HELLOJAR;

import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;
import vn.edu.ptit.Invoice;
import vn.edu.ptit.Rule;

import java.util.ArrayList;
import java.util.Scanner;

public class PaymentController {
    private Invoice invoice;
    private Student student;
    private Rule rule;
    private Subject subject;

    public PaymentController(){
        Scanner sc = new Scanner(System.in);

        String maSV = sc.nextLine();
        String tenSV = sc.nextLine();
        int soMonHoc = Integer.parseInt(sc.nextLine());

        String maMonHoc;
        String tenMonHoc;
        int soTinChi;
        int tongHocPhi = 0;

        Student student = new Student(maSV, tenSV);
        ArrayList<Subject> arrayList = new ArrayList<>();
        while (soMonHoc-- > 0){
            maMonHoc = sc.nextLine();
            tenMonHoc = sc.nextLine();
            soTinChi = Integer.parseInt(sc.nextLine());
            arrayList.add(new Subject(tenMonHoc,maMonHoc,soTinChi));
        }

        String maQD = sc.nextLine();
        String tenQD = sc.nextLine();
        double giaTinChi = Double.parseDouble(sc.nextLine());

        for (Subject s : arrayList){
            tongHocPhi += giaTinChi * s.getCredit();
        }

        rule = new Rule(maQD, tenQD, tongHocPhi);
        invoice = new Invoice(rule);
        invoice.setAlSubject(arrayList);
        invoice.setAmount(tongHocPhi);
        invoice.setSt(student);
    }

    public Invoice getInvoice(){
        return invoice;
    }
}
