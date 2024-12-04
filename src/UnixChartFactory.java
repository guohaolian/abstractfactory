public class UnixChartFactory implements ChartFactory{
    @Override
    public IPieChart producePieChart() {
        return new UnixPieChart();
    }

    @Override
    public ILineChart produceLineChart() {
        return new UnixLineChart();
    }

    @Override
    public IDotChart produceDotChart() {
        return new UnixDotChart();
    }

    @Override
    public ICurveChart produceCurveChart() {
        return new UnixCurveChart();
    }
}
