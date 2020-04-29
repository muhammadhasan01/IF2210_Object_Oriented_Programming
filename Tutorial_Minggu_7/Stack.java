import java.util.*;

class Stack {
	private int size;
	private int capacity;
	private int[] data;

	public Stack() {
		this.capacity = 10;
		this.size = 0;
		this.data = new int[this.capacity];
	}

	public Stack(int cap) {
		this.capacity = cap;
		this.size = 0;
		this.data = new int[this.capacity];
	}

	public void push(int x) {
		if (this.size >= this.capacity) return;
		this.data[this.size] = x;
		this.size++;
	}

	public int pop() {
		int top = 0;
		if (this.size > 0) {
			this.size--;
			top = this.data[this.size];
		}
		return top;
	}

	public void push(int[] x) {
		for (int k : x) {
			this.push(k);
		}
	}
}