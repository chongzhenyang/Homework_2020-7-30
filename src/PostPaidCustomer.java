import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

class PrePaidCustomer {
    private String name;
    private int id;
    private int totalPayment;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public int getTotalPayment(){
         return totalPayment;
     }

     public void setTotalPayment(int totalPayment){
         this.totalPayment += totalPayment;
     }

     public void buyPlan(){
         setTotalPayment(500);
     }

     public void totalMonthlyRate(){
         int yearlyRate = 12 * 1000;
         setTotalPayment(yearlyRate);
     }
 }

 public class PostPaidCustomer{
     private String name;
     private int id;
     private int totalPayment;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     public int getTotalPayment(){
         return totalPayment;
     }

     public void setTotalPayment(int totalPayment){
         this.totalPayment += totalPayment;
     }

     public void buyPlan(){
         setTotalPayment(600);
     }

     public void totalMonthlyRate(){
         int yearlyRate = 12 * 2000;
         setTotalPayment(yearlyRate);
     }

     public static void main(String args[]){
         PrePaidCustomer pre = new PrePaidCustomer();
         PostPaidCustomer post = new PostPaidCustomer();
         pre.buyPlan();
         pre.totalMonthlyRate();
         post.buyPlan();
         post.totalMonthlyRate();
         System.out.println("Total of Prepaid customer " + pre.getTotalPayment());
         System.out.println("Total of Postpaid customer " + post.getTotalPayment());
     }
 }
