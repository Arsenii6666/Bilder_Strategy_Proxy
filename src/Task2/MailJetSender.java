package Task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class MailJetSender{
    public void sendMail(MailInfo mailInfo) throws MailjetException, MailjetSocketTimeoutException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient("834698f79f4ca82a6e834c008058c600", "1c5a1d1e97d5d297c17582a78ef6bda2",
                new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "arsenius6666@gmail.com")
                                        .put("Name", "Arsenii"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", mailInfo.getClient().getEmail())
                                                .put("Name", mailInfo.getClient().getName())))
                                .put(Emailv31.Message.SUBJECT, mailInfo.getEmailType().getSubject())
                                .put(Emailv31.Message.TEXTPART, mailInfo.getEmailType().getMessage(mailInfo.getClient()))
                                ));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}

