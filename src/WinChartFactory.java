public class WinChartFactory implements ChartFactory {
    public IPieChart producePieChart(){
        return new WinPieChart();
    }

    @Override
    public ILineChart produceLineChart() {
        return new WinLineChart();
    }

    @Override
    public IDotChart produceDotChart() {
        return new WinDotChart();
    }

    @Override
    public ICurveChart produceCurveChart() {
        return new WinCurveChart();
    }
}
