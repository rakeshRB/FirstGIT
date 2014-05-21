import java.awt.* ;
import javax.swing.* ;
import java.util.* ;
import java.text.* ;

public class IstToEst extends JFrame
{
    DigitalClock dc = new DigitalClock() ;
    DigitalClock1 de = new DigitalClock1() ;

   	public IstToEst()
    {
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        setTitle("Time Center");
        c.add(dc, BorderLayout.NORTH);
        c.add(de, BorderLayout.CENTER);
        setSize(110,110);
        show();

    }

    public static void main(String[] args)
    {
        new IstToEst();
    }
}

class DigitalClock extends JLabel implements Runnable
{
    DigitalClock()
    {
        Thread dc = new Thread(this);
        dc.start();
     }

    public void run()
    {
        try
        {
            while(true)
            {
            	TimeZone est = TimeZone.getTimeZone("America/Montreal");
            	Date thetime = new Date() ;
                DateFormat d1f  = DateFormat.getTimeInstance(DateFormat.LONG, Locale.US);
            	d1f.setTimeZone(est);
            	DateFormat.getTimeInstance(DateFormat.LONG);
                setText(d1f.format(thetime));
                Thread.sleep(1000);

            }
        }
        catch(InterruptedException xcp)
        {
            setText(xcp.getMessage()) ;
        }
    }
}

class DigitalClock1 extends JLabel implements Runnable
{
    DigitalClock1()
    {
        Thread de = new Thread(this);
        de.start();
    }

    public void run()
    {
        try
        {
            while(true)
            {
            	TimeZone est = TimeZone.getTimeZone("IST");
            	Date thetime = new Date() ;
                DateFormat d1f  = DateFormat.getTimeInstance(DateFormat.LONG, Locale.US);
            	d1f.setTimeZone(est);
            	DateFormat.getTimeInstance(DateFormat.LONG);
                setText(d1f.format(thetime));
                Thread.sleep(1000);

            }
        }
        catch(InterruptedException xcp)
        {
            setText(xcp.getMessage()) ;
        }
    }
}











