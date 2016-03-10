package com.ampersand.lcu.math.measurments;

public enum Mass {

	MILLIGRAM {

		@Override
		public double toMilligram(double value) {
			return value;
		}

		@Override
		public double toCentigram(double value) {
			return value * 0.1;
		}

		@Override
		public double toDecigram(double value) {
			return value * 0.01;
		}

		@Override
		public double toGram(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toDecagram(double value) {
			return value * 1.0E-4;
		}

		@Override
		public double toHectogram(double value) {
			return value * 1.0E-5;
		}

		@Override
		public double toKilogram(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toQuintal(double value) {
			return value * 2.0E-8;
		}

		@Override
		public double toTon(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double convert(double source_value, Mass source_unit) {
			return source_unit.toMilligram(source_value);
		}

		@Override
		public String symbol() {
			return "mg";
		}
	},

	CENTIGRAM {

		@Override
		public double toMilligram(double value) {
			return value * 10;
		}

		@Override
		public double toCentigram(double value) {
			return value;
		}

		@Override
		public double toDecigram(double value) {
			return value * 0.1;
		}

		@Override
		public double toGram(double value) {
			return value * 0.01;
		}

		@Override
		public double toDecagram(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toHectogram(double value) {
			return value * 1.0E-4;
		}

		@Override
		public double toKilogram(double value) {
			return value * 1.0E-5;
		}

		@Override
		public double toQuintal(double value) {
			return value * 2.0E-7;
		}

		@Override
		public double toTon(double value) {
			return value * 1.0E-8;
		}

		@Override
		public double convert(double source_value, Mass source_unit) {
			return source_unit.toCentigram(source_value);
		}

		@Override
		public String symbol() {
			return "cg";
		}
	},

	DECIGRAM {

		@Override
		public double toMilligram(double value) {
			return value * 100;
		}

		@Override
		public double toCentigram(double value) {
			return value * 10;
		}

		@Override
		public double toDecigram(double value) {
			return value;
		}

		@Override
		public double toGram(double value) {
			return value * 0.1;
		}

		@Override
		public double toDecagram(double value) {
			return value * 0.01;
		}

		@Override
		public double toHectogram(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toKilogram(double value) {
			return value * 1.0E-4;
		}

		@Override
		public double toQuintal(double value) {
			return value * 2.0E-6;
		}

		@Override
		public double toTon(double value) {
			return value * 1.0E-7;
		}

		@Override
		public double convert(double source_value, Mass source_unit) {
			return source_unit.toDecigram(source_value);
		}

		@Override
		public String symbol() {
			return "dg";
		}
	},

	GRAM {

		@Override
		public double toMilligram(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toCentigram(double value) {
			return value * 100;
		}

		@Override
		public double toDecigram(double value) {
			return value * 10;
		}

		@Override
		public double toGram(double value) {
			return value;
		}

		@Override
		public double toDecagram(double value) {
			return value * 0.1;
		}

		@Override
		public double toHectogram(double value) {
			return value * 0.01;
		}

		@Override
		public double toKilogram(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toQuintal(double value) {
			return value * 2.0E-5;
		}

		@Override
		public double toTon(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double convert(double source_value, Mass source_unit) {
			return source_unit.toGram(source_value);
		}

		@Override
		public String symbol() {
			return "g";
		}
	},

	DECAGRAM {

		@Override
		public double toMilligram(double value) {
			return value * 1.0E+4;
		}

		@Override
		public double toCentigram(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toDecigram(double value) {
			return value * 100;
		}

		@Override
		public double toGram(double value) {
			return value * 10;
		}

		@Override
		public double toDecagram(double value) {
			return value;
		}

		@Override
		public double toHectogram(double value) {
			return value * 0.1;
		}

		@Override
		public double toKilogram(double value) {
			return value * 0.01;
		}

		@Override
		public double toQuintal(double value) {
			return value * 2.0E-4;
		}

		@Override
		public double toTon(double value) {
			return value * 1.0E-5;
		}

		@Override
		public double convert(double source_value, Mass source_unit) {
			return source_unit.toDecagram(source_value);
		}

		@Override
		public String symbol() {
			return "dag";
		}
	},

	HECTOGRAM {

		@Override
		public double toMilligram(double value) {
			return value * 1.0E+5;
		}

		@Override
		public double toCentigram(double value) {
			return value * 1.0E+4;
		}

		@Override
		public double toDecigram(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toGram(double value) {
			return value * 100;
		}

		@Override
		public double toDecagram(double value) {
			return value * 10;
		}

		@Override
		public double toHectogram(double value) {
			return value;
		}

		@Override
		public double toKilogram(double value) {
			return value * 0.1;
		}

		@Override
		public double toQuintal(double value) {
			return value * 2.0E-3;
		}

		@Override
		public double toTon(double value) {
			return value * 1.0E-4;
		}

		@Override
		public double convert(double source_value, Mass source_unit) {
			return source_unit.toHectogram(source_value);
		}

		@Override
		public String symbol() {
			return "hg";
		}
	},

	KILOGRAM {

		@Override
		public double toMilligram(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toCentigram(double value) {
			return value * 1.0E+5;
		}

		@Override
		public double toDecigram(double value) {
			return value * 1.0E+4;
		}

		@Override
		public double toGram(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toDecagram(double value) {
			return value * 100;
		}

		@Override
		public double toHectogram(double value) {
			return value * 10;
		}

		@Override
		public double toKilogram(double value) {
			return value;
		}

		@Override
		public double toQuintal(double value) {
			return value * 0.02;
		}

		@Override
		public double toTon(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double convert(double source_value, Mass source_unit) {
			return source_unit.toKilogram(source_value);
		}

		@Override
		public String symbol() {
			return "kg";
		}
	},

	QUINTAL {

		@Override
		public double toMilligram(double value) {
			return value * 5.0E+7;
		}

		@Override
		public double toCentigram(double value) {
			return value * 5.0E+6;
		}

		@Override
		public double toDecigram(double value) {
			return value * 5.0E+5;
		}

		@Override
		public double toGram(double value) {
			return value * 5.0E+4;
		}

		@Override
		public double toDecagram(double value) {
			return value * 5.0E+3;
		}

		@Override
		public double toHectogram(double value) {
			return value * 500;
		}

		@Override
		public double toKilogram(double value) {
			return value * 50;
		}

		@Override
		public double toQuintal(double value) {
			return value;
		}

		@Override
		public double toTon(double value) {
			return value * 0.05;
		}

		@Override
		public double convert(double source_value, Mass source_unit) {
			return source_unit.toQuintal(source_value);
		}

		@Override
		public String symbol() {
			return "quintal";
		}
	},

	TON {

		@Override
		public double toMilligram(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toCentigram(double value) {
			return value * 1.0E+8;
		}

		@Override
		public double toDecigram(double value) {
			return value * 1.0E+7;
		}

		@Override
		public double toGram(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toDecagram(double value) {
			return value * 1.0E+5;
		}

		@Override
		public double toHectogram(double value) {
			return value * 1.0E+4;
		}

		@Override
		public double toKilogram(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toQuintal(double value) {
			return value * 20;
		}

		@Override
		public double toTon(double value) {
			return value;
		}

		@Override
		public double convert(double source_value, Mass source_unit) {
			return source_unit.toTon(source_value);
		}

		@Override
		public String symbol() {
			return "t";
		}
	};

	public double toMilligram(double value) {
		throw new AbstractMethodError();
	}

	public double toCentigram(double value) {
		throw new AbstractMethodError();
	}

	public double toDecigram(double value) {
		throw new AbstractMethodError();
	}

	public double toGram(double value) {
		throw new AbstractMethodError();
	}

	public double toDecagram(double value) {
		throw new AbstractMethodError();
	}

	public double toHectogram(double value) {
		throw new AbstractMethodError();
	}

	public double toKilogram(double value) {
		throw new AbstractMethodError();
	}

	public double toQuintal(double value) {
		throw new AbstractMethodError();
	}

	public double toTon(double value) {
		throw new AbstractMethodError();
	}

	public double convert(double source_value, Mass source_unit) {
		throw new AbstractMethodError();
	}

	public String symbol() {
		throw new AbstractMethodError();
	}
}
