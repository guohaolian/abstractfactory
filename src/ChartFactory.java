public interface ChartFactory {
    public IDotChart produceDotChart();
    public ILineChart produceLineChart();
    public IPieChart producePieChart();
    public ICurveChart produceCurveChart();
}
