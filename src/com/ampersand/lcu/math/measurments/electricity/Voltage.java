package com.ampersand.lcu.math.measurments.electricity;

public enum Voltage {

	PICOVOLT {

		@Override
		public double toPicovolt(double value) {
			return value;
		}

		@Override
		public double toNanovolt(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toAbvolt(double value) {
			return value * 1.0E-4;
		}

		@Override
		public double toMicrovolt(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toMillivolt(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double tovolt(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double toKilovolt(double value) {
			return value * 1.0E-15;
		}

		@Override
		public double toMegavolt(double value) {
			return value * 1.0E-18;
		}

		@Override
		public double toGigavolt(double value) {
			return value * 1.0E-21;
		}

		@Override
		public double toTeravolt(double value) {
			return value * 1.0E-24;
		}

		@Override
		public double convert(double source_value, Voltage source_unit) {
			return source_unit.toPicovolt(source_value);
		}

		@Override
		public String symbol() {
			return "pA";
		}
	},

	NANOVOLT {

		@Override
		public double toPicovolt(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toNanovolt(double value) {
			return value;
		}

		@Override
		public double toAbvolt(double value) {
			return value * 0.1;
		}

		@Override
		public double toMicrovolt(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toMillivolt(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double tovolt(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toKilovolt(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double toMegavolt(double value) {
			return value * 1.0E-15;
		}

		@Override
		public double toGigavolt(double value) {
			return value * 1.0E-18;
		}

		@Override
		public double toTeravolt(double value) {
			return value * 1.0E-21;
		}

		@Override
		public double convert(double source_value, Voltage source_unit) {
			return source_unit.toNanovolt(source_value);
		}

		@Override
		public String symbol() {
			return "nA";
		}
	},

	MICROVOLT {

		@Override
		public double toPicovolt(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toNanovolt(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toAbvolt(double value) {
			return value * 100;
		}

		@Override
		public double toMicrovolt(double value) {
			return value;
		}

		@Override
		public double toMillivolt(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double tovolt(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toKilovolt(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toMegavolt(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double toGigavolt(double value) {
			return value * 1.0E-15;
		}

		@Override
		public double toTeravolt(double value) {
			return value * 1.0E-18;
		}

		@Override
		public double convert(double source_value, Voltage source_unit) {
			return source_unit.toMicrovolt(source_value);
		}

		@Override
		public String symbol() {
			return "µA";
		}
	},

	MILLIVOLT {

		@Override
		public double toPicovolt(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toNanovolt(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toAbvolt(double value) {
			return value * 1.0E+5;
		}

		@Override
		public double toMicrovolt(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toMillivolt(double value) {
			return value;
		}

		@Override
		public double tovolt(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toKilovolt(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toMegavolt(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toGigavolt(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double toTeravolt(double value) {
			return value * 1.0E-15;
		}

		@Override
		public double convert(double source_value, Voltage source_unit) {
			return source_unit.toMillivolt(source_value);
		}

		@Override
		public String symbol() {
			return "mA";
		}
	},

	VOLT {

		@Override
		public double toPicovolt(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toNanovolt(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toAbvolt(double value) {
			return value * 1.0E+8;
		}

		@Override
		public double toMicrovolt(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toMillivolt(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double tovolt(double value) {
			return value;
		}

		@Override
		public double toKilovolt(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toGigavolt(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toTeravolt(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double convert(double source_value, Voltage source_unit) {
			return source_unit.tovolt(source_value);
		}

		@Override
		public String symbol() {
			return "A";
		}
	},

	ABVOLT {

		@Override
		public double toPicovolt(double value) {
			return value * 1.0E+4;
		}

		@Override
		public double toNanovolt(double value) {
			return value * 10;
		}

		@Override
		public double toAbvolt(double value) {
			return value;
		}

		@Override
		public double toMicrovolt(double value) {
			return value * 1.0E-2;
		}

		@Override
		public double toMillivolt(double value) {
			return value * 1.0E-5;
		}

		@Override
		public double tovolt(double value) {
			return value * 1.0E-8;
		}

		@Override
		public double toKilovolt(double value) {
			return value * 1.0E-11;
		}

		@Override
		public double toMegavolt(double value) {
			return value * 1.0E-14;
		}

		@Override
		public double toGigavolt(double value) {
			return value * 1.0E-17;
		}

		@Override
		public double toTeravolt(double value) {
			return value * 1.0E-20;
		}

		@Override
		public double convert(double source_value, Voltage source_unit) {
			return source_unit.toAbvolt(source_value);
		}

		@Override
		public String symbol() {
			return "abA";
		}
	},

	KILOVOLT {

		@Override
		public double toPicovolt(double value) {
			return value * 1.0E+15;
		}

		@Override
		public double toNanovolt(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toAbvolt(double value) {
			return value * 1.0E+11;
		}

		@Override
		public double toMicrovolt(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toMillivolt(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double tovolt(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toKilovolt(double value) {
			return value;
		}

		@Override
		public double toMegavolt(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toGigavolt(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toTeravolt(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double convert(double source_value, Voltage source_unit) {
			return source_unit.toKilovolt(source_value);
		}

		@Override
		public String symbol() {
			return "kA";
		}
	},

	MEGAVOLT {

		@Override
		public double toPicovolt(double value) {
			return value * 1.0E+18;
		}

		@Override
		public double toNanovolt(double value) {
			return value * 1.0E+15;
		}

		@Override
		public double toAbvolt(double value) {
			return value * 1.0E+14;
		}

		@Override
		public double toMicrovolt(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toMillivolt(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double tovolt(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toKilovolt(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toMegavolt(double value) {
			return value;
		}

		@Override
		public double toGigavolt(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toTeravolt(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double convert(double source_value, Voltage source_unit) {
			return source_unit.toMegavolt(source_value);
		}

		@Override
		public String symbol() {
			return "MA";
		}
	},

	GIGAVOLT {

		@Override
		public double toPicovolt(double value) {
			return value * 1.0E+21;
		}

		@Override
		public double toNanovolt(double value) {
			return value * 1.0E+18;
		}

		@Override
		public double toAbvolt(double value) {
			return value * 1.0E+17;
		}

		@Override
		public double toMicrovolt(double value) {
			return value * 1.0E+15;
		}

		@Override
		public double toMillivolt(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double tovolt(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toKilovolt(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toMegavolt(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toGigavolt(double value) {
			return value;
		}

		@Override
		public double toTeravolt(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double convert(double source_value, Voltage source_unit) {
			return source_unit.toGigavolt(source_value);
		}

		@Override
		public String symbol() {
			return "GA";
		}
	},

	TERAVOLT {

		@Override
		public double toPicovolt(double value) {
			return value * 1.0E+24;
		}

		@Override
		public double toNanovolt(double value) {
			return value * 1.0E+21;
		}

		@Override
		public double toAbvolt(double value) {
			return value * 1.0E+20;
		}

		@Override
		public double toMicrovolt(double value) {
			return value * 1.0E+18;
		}

		@Override
		public double toMillivolt(double value) {
			return value * 1.0E+15;
		}

		@Override
		public double tovolt(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toKilovolt(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toMegavolt(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toGigavolt(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toTeravolt(double value) {
			return value;
		}

		@Override
		public double convert(double source_value, Voltage source_unit) {
			return source_unit.toTeravolt(source_value);
		}

		@Override
		public String symbol() {
			return "TA";
		}
	};

	public double toPicovolt(double value) {
		throw new AbstractMethodError();
	}

	public double toNanovolt(double value) {
		throw new AbstractMethodError();
	}

	public double toMicrovolt(double value) {
		throw new AbstractMethodError();
	}

	public double toMillivolt(double value) {
		throw new AbstractMethodError();
	}

	public double tovolt(double value) {
		throw new AbstractMethodError();
	}

	public double toAbvolt(double value) {
		throw new AbstractMethodError();
	}

	public double toKilovolt(double value) {
		throw new AbstractMethodError();
	}

	public double toMegavolt(double value) {
		throw new AbstractMethodError();
	}

	public double toGigavolt(double value) {
		throw new AbstractMethodError();
	}

	public double toTeravolt(double value) {
		throw new AbstractMethodError();
	}

	public double convert(double source_value, Voltage source_unit) {
		throw new AbstractMethodError();
	}

	public String symbol() {
		throw new AbstractMethodError();
	}
}
