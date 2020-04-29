abstract class Rekening {
	protected String nama;
	protected double saldo;
	protected double sukuBunga;

	public Rekening(String n, double d, double s) {
		this.nama = n;
		this.saldo = (d < 0 ? 0 : d);
		this.sukuBunga = s;
	}

	abstract public void setor(double uang);
	abstract public void tarik(double uang);
	abstract public void update();

	public double hitungBiaya() {
		double x1 = 10.0;
		double x2 = 0.1 * (this.saldo);
		return (x1 < x2 ? x1 : x2);
	}

	public String getNama() {
		return this.nama;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public double getSukuBunga() {
		return this.sukuBunga;
	}
}