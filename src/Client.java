public class Client {
    public static void main(String[] args) {
        ChartFactory winFactory ;
        ChartFactory linuxFactory ;
        ChartFactory unixFactory ;

        winFactory =(ChartFactory)XMLUtil.getBean("win");
        linuxFactory =(ChartFactory)XMLUtil.getBean("linux");
        unixFactory =(ChartFactory)XMLUtil.getBean("unix");
        winFactory.producePieChart().display();
        linuxFactory.produceLineChart().display();
        winFactory.produceDotChart().display();
        linuxFactory.produceCurveChart().display();
    }
}
