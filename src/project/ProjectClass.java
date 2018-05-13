package project;
 import org.openqa.selenium.*;   //����selenium���е�����
 import org.openqa.selenium.WebDriver.*;  //����selenium���е�����
 import org.openqa.selenium.chrome.*;  //����selenium���е�����
public class ProjectClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe"); //�����ȸ������
		WebDriver driver=new ChromeDriver();
		Navigation navigation=driver.navigate();
		Window window = driver.manage().window();
        //window.maximize(); //�������
        Thread.sleep(3000);
		window.setSize(new Dimension(1024,768));//��������Ĵ�С�Զ���Ϊ1024*768
		driver.get("https://www.baidu.com");  //���ʰٶ���ҳ
		//navigation.refresh(); //ҳ��ˢ��
		WebElement baiduTextBox = driver.findElement(By.xpath("//input[@id='kw']")); //ָ��������
		//WebElement baiduTextBox1 = driver.findElement(By.cssSelector("input#kw"));
		navigation.to("http://www.hao123.com");//���ʺ�123
		try {
			Thread.sleep(3000);  //�ȴ�3��
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		navigation.back();//���˰ٶ���ҳ
        try {
        	Thread.sleep(3000);//�ȴ�3��
        } catch(InterruptedException e) {
        	e.printStackTrace();//ǰ������123
        }
        navigation.forward();
        
	}
}
