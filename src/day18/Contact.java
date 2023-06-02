package day18;

public class Contact {
    public String name;
    public int phoneNumber;
    public String email;

    public void setInfo(String name, int phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void call(){
        System.out.println("Calling " + name +" now");
    }
    public void sendMessage(){
        System.out.println("sending message to " + phoneNumber + " now");
    }
    public void sendEmail(){
        System.out.println("sending email to " + email + " now");
    }

    public static void main(String[] args) {
       Contact a1 = new Contact();
       a1.setInfo("Anna",55522255,"cdscsdnc");
       a1.call();
       a1.sendMessage();
       a1.sendEmail();

    }
}
/*
2. Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"


 */