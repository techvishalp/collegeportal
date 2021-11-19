package listener;

import java.util.Calendar;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class Customlistener
 *
 */
@WebListener
public class Customlistener implements HttpSessionListener {
HttpSession hs=null;
    /**
     * Default constructor. 
     */
    public Customlistener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent se)  { 
        hs=se.getSession();
        String id=hs.getId();
        System.out.println("Session ID: "+id);
        long info=hs.getCreationTime();
        System.out.println(info);
        Calendar c=Calendar.getInstance();
        c.setTimeInMillis(info);
        int hour=c.get(Calendar.HOUR);
        int minute=c.get(Calendar.MINUTE);
        int second=c.get(Calendar.SECOND);
        int day=c.get(Calendar.DATE);
        int month=c.get(Calendar.MONTH)+1;
        int year=c.get(Calendar.YEAR);
        int type=c.get(Calendar.AM_PM);
        System.out.println("Hour: "+hour+type+" Minute: "+minute+" Second: "+second);
        System.out.println("Day: "+day+" Month: "+month+" Year: "+year);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    }
	
}
