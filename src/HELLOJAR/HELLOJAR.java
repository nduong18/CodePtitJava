package HELLOJAR;
import view.InvoiceView;
import vn.edu.ptit.Invoice;
public class HELLOJAR {
    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }
}
