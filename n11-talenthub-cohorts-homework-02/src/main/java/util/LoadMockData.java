package util;

import entity.Customer;
import entity.Invoice;
import entity.Order;
import entity.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mehmet Akif Tanisik
 */
public final class LoadMockData {

    private static final List<Customer> CUSTOMER_LIST = new ArrayList<>();
    private static final List<Invoice> INVOICE_LIST = new ArrayList<>();

    static {
        loadMockData();
    }

    private LoadMockData() {
    }
    public static List<Customer> getCustomerList() {
        return CUSTOMER_LIST;
    }
    public static List<Invoice> getInvoiceList() {
        return INVOICE_LIST;
    }

    private static void loadMockData() {
        Customer john = new Customer("John", "Doe","john@mail.com","03121232233","it",new ArrayList<>(), LocalDate.of(2024, 6,12));
        Customer mark = new Customer("Mark", "Flick","mark@mail.com","03121232234","logistic",new ArrayList<>(), LocalDate.now());
        Customer marry = new Customer("Marry", "Tson","marry@mail.com","03121232235","food",new ArrayList<>(), LocalDate.now());
        Customer izac = new Customer("Izac", "Rex","izac@mail.com","03121232236","it",new ArrayList<>(), LocalDate.now());
        Customer chris = new Customer("Chris", "Thum","chris@mail.com","03121232237","food",new ArrayList<>(), LocalDate.now());

        Product slipper = new Product("slipper", 1600.0);
        Product glassses = new Product("glassses", 50.0);
        Product book = new Product("book", 10.0);
        Product notebook = new Product("notebook", 30.0);
        Product pen = new Product("pen", 2.5);

        Order johnOrder = new Order(john, List.of(slipper,glassses));
        Order markOrder = new Order(mark, List.of(book,glassses));
        Order marryOrder = new Order(marry, List.of(notebook,pen));
        Order izacOrder = new Order(izac, List.of(slipper,glassses,glassses,pen));
        Order chrisOrder = new Order(chris, List.of(book,notebook,pen,glassses));

        john.getOrders().add(johnOrder);
        mark.getOrders().add(markOrder);
        marry.getOrders().add(marryOrder);
        izac.getOrders().add(izacOrder);
        chris.getOrders().add(chrisOrder);

        Invoice johnInvoice = new Invoice(LocalDateTime.now(), johnOrder);
        Invoice markInvoice = new Invoice(LocalDateTime.now(),  markOrder);
        Invoice marryInvoice = new Invoice(LocalDateTime.now(),  marryOrder);
        Invoice izacInvoice = new Invoice(LocalDateTime.now(),  izacOrder);
        Invoice chrisInvoice = new Invoice(LocalDateTime.now(),  chrisOrder);

        CUSTOMER_LIST.add(john);
        CUSTOMER_LIST.add(mark);
        CUSTOMER_LIST.add(marry);
        CUSTOMER_LIST.add(izac);
        CUSTOMER_LIST.add(chris);

        INVOICE_LIST.add(johnInvoice);
        INVOICE_LIST.add(markInvoice);
        INVOICE_LIST.add(marryInvoice);
        INVOICE_LIST.add(izacInvoice);
        INVOICE_LIST.add(chrisInvoice);


    }


}

