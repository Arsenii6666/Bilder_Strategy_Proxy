package Task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    List<MailInfo> mailInfos=new ArrayList<MailInfo>();
    MailJetSender mailJetSender=new MailJetSender();
    public void addMailInfos(MailInfo mailInfo){
        mailInfos.add(mailInfo);
    }
    public void sendAll() throws MailjetSocketTimeoutException, MailjetException {
        for (MailInfo mail:mailInfos) {
            mailJetSender.sendMail(mail);
        }
    }
}
