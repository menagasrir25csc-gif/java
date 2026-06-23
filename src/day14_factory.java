import com.sun.jdi.StringReference;

public class day14_factory {
      interface Notification {
          void send(String to, String message);
      }

      class EmailNotification implements Notification {
          public void send(String to, String message) {
              System.out.println("Sending Email: " + message + ", to " + to);
          }
      }

      class WhatsAppNotification implements Notification {

          public void send(String to, String message) {
              System.out.println("Sending WhatsApp:" + message + ",to " + to);
          }
      }

      static Notification getNotification(day14_factory factory, String type) {
          return switch (type) {
              case "Email" -> factory.new EmailNotification();
              case "WhatsApp" -> factory.new WhatsAppNotification();
              default -> throw new IllegalArgumentException("Invalid Notification type: " + type);
          };
      }

      static void main() {
          day14_factory factory = new day14_factory();
          String type = "WhatsApp";
          getNotification(factory, type).send("9894552258", "hello");
      }
  }