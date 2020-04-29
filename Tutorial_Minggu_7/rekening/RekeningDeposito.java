class RekeningDeposito extends Rekening {
	protected int bulan;

	public RekeningDeposito(String n, double d) {
		super(n, d, 0.15);
		this.bulan = 0;
	}

	public void setor(double uang) {
		System.out.println("Tidak dapat melakukan penyetoran uang untuk rekening ini.");
	}

	public void tarik(double uang) {
		System.out.println("Tidak dapat melakukan penarikan uang sebagian untuk rekening ini.");
	}

	public void update() {
		this.bulan++;
		double gt = (this.bulan > 12 ? this.saldo * this.sukuBunga : 0);
		double by = this.hitungBiaya();
		this.saldo += (gt - by);
		if (this.saldo < 0) this.saldo = 0;
	}

	public void tarik() {
		if (this.bulan < 12) {
			double pen = 0.2 * this.saldo;
			System.out.println("Anda terkena penalti sebesar " + pen + ".");
		}
		this.saldo = 0;
	}
}