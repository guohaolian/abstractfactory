public class LinuxChartFactory implements ChartFactory {
    @Override
    public IPieChart producePieChart() {
        return new LinuxPieChart();
    }

    @Override
    public ILineChart produceLineChart() {
        return new LinuxLineChart();
    }

    @Override
    public IDotChart produceDotChart() {
        return new LinuxDotChart();
    }

    @Override
    public ICurveChart produceCurveChart() {
        return new LinuxCurveChart();
    }
}
