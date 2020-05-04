using OpenQA.Selenium;
//using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.IE;

class EntryPoint
{
    static void Main()
    {
        IWebDriver driver = new InternetExplorerDriver();

        // driver.Navigate().GoToUrl("http://testing.todorvachev.com");
        driver.Navigate().GoToUrl("http://www.google.com");
        driver.FindElement(By.Name("q")).SendKeys("Learn Automation");
    }
}