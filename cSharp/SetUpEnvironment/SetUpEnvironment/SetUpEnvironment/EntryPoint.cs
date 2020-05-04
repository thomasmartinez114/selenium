using OpenQA.Selenium;
//using OpenQA.Selenium.Chrome;
using OpenQA.Selenium.IE;

class EntryPoint
{
    static void Main()
    {
        var driver = new InternetExplorerDriver();
        driver.Navigate().GoToUrl("http://bing.com");
        Console.Read();
    }
}