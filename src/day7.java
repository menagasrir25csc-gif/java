/*public class day7 {
    /*static class Request{
        String name;
        String date;
        String reason;

        Request(String name, String date, String reason){
            this.name = name;
            this.date = date;
            this.reason = reason;
        }

        void approve() {
            System.out.println("Approving request");
        }
        void reject() {
            System.out.println("Reject request");
        }
    }

    static class LeaveRequest extends Request {

        LeaveRequest(String name, String date, String reason) {
            super(name, date, reason);
        }
        void approveLeaveRequest() {
            System.out.println("Approving leave request");
        }
        void rejectLeaveRequest() {
            System.out.println("Reject leave request");
        }
    }
    static class OnDutyRequest extends Request {

        OnDutyRequest(String name, String date, String reason) {
            super(name, date, reason);
        }
        void approveOnDutyRequest() {
            System.out.println("Approving on duty request");
        }
        void rejectOnDutyRequest() {
            System.out.println("Reject on duty request");
        }
    }

    static void main() {
        LeaveRequest leaveRequest = new LeaveRequest("Menaga","12.06.2026","cold");
        leaveRequest.approveLeaveRequest();
        OnDutyRequest onDutyRequest = new OnDutyRequest("Menaga","11.07.2026","Culturals");
        onDutyRequest.rejectOnDutyRequest();
    }
}*/



  /*public class day7 {
      static class payment {
          String amount;

          void transfer() {
              System.out.println("payment successful");
          }

          static class UPIpayment extends payment {
              @Override
              void transfer() {
                  System.out.println("UPI payment ");
              }
          }

          static class Cardpayment extends payment {
              @Override
              void transfer() {
                  System.out.println("Card payment");
              }
          }

          static class NBpayment extends payment {
              @Override
              void transfer() {
                  System.out.println("NB payment ");
              }
          }

          static void main() {
              UPIpayment UPIpayment = new UPIpayment();
              UPIpayment.transfer();
              Cardpayment Cardpayment = new Cardpayment();
              Cardpayment.transfer();
              NBpayment NBpayment = new NBpayment();
              NBpayment.transfer();
          }
      }
  }
*/


public class day7{

    interface Employee {
        String Name();
        String id();
        String Salary();
    }

    static class BankEmployee implements Employee {

        @Override
        public String Name() {
            return "sanjai";
        }

        @Override
        public String id() {
            return "112";
        }

        @Override
        public String Salary() {
            return "45000";
        }

        public String solveprogram() {
            System.out       .println("solution");
            return "solution";
        }
    }

    static class CheckingEmployee implements Employee {

        @Override
        public String Name() {
            return "menaga";
        }

        @Override
        public String id() {
            return "111m  ";
        }

        @Override
        public String Salary() {
            return "50000";
        }

        public String work() {
            System.out.println("process");
            return "process";
        }
    }

    public static void main(String[] args) {

        BankEmployee bank = new BankEmployee();

        System.out.println("Name : " + bank.Name());
        System.out.println("ID : " + bank.id());
        System.out.println("Salary : " + bank.Salary());
        bank.solveprogram();

        System.out.println();

        CheckingEmployee checking = new CheckingEmployee();

        System.out.println("Name : " + checking.Name());
        System.out.println("ID : " + checking.id());
        System.out.println("Salary : " + checking.Salary());
        checking.work();
    }
}
