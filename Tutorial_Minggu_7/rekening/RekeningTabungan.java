class RekeningTabungan extends Rekening {
	public RekeningTabungan(String n, double d) {
		super(n, d, 0.05);
	}

	public void setor(double uang) {
		this.saldo += uang;
	}

	public void tarik(double uang) {
		if (this.saldo < uang) return;
		this.saldo -= uang;
	}

	public void update() {
		double gt = this.saldo * this.sukuBunga;
		double by = this.hitungBiaya();
		this.saldo += (gt - by);
		if (this.saldo < 0) this.saldo = 0;
	}
}