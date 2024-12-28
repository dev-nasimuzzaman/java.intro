/*______________________________________________________________________________________________________________________
Author: [Md Nasimuzzaman]
Created On: [December 26, 2024]
GitHub: [https://github.com/dev-nasimuzzaman]

Description:
[Dependency injection is a design pattern  which a class receives it's dependencies from external sources rather than
creating them itself. This helps to making classes more moduler, flexible and easier to test and there are various way
to implementing dependency injection. Common approach among them through the constructor injection.]

Modification History:
Date           Author            Description
------------   ---------------   ---------------------------------------------------------------------------------------
[12/24/2024]   Md Nasimuzzaman   Initial version of the code.
[12/28/2024]   Md Nasimuzzaman   Added the modification history.
________________________________________________________________________________________________________________________
*/

// service interface
interface MessageService{
    String getMessage();
}
//implementation of message service
class EmailService implements MessageService{
    @Override
    public String getMessage(){
        return "Email Message";
    }
}
// class that depends on Message Service through constructor injection
class MessageProcessor{
    private final MessageService messageService;

    //constructor injection
    public MessageProcessor(MessageService messageService){
        this.messageService = messageService;
    }
    public void processMessage(){
        String message = messageService.getMessage();
        System.out.println("Processing Message :" + message);
    }
}
public class Dependency_Program {
    public static void main(String[] args){
        //create an instance of a message service - dependency
        MessageService emailService = new EmailService();
        //injecting the dependency into MessageProcessor
        MessageProcessor messageProcessor = new MessageProcessor(emailService);
        //performing message action or processing
        messageProcessor.processMessage();
    }
}
