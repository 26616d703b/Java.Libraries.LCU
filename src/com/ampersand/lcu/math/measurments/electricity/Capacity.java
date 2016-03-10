package com.ampersand.lcu.math.measurments.electricity;

public enum Capacity {

	FEMTOFARAD {

		@Override
		public double toFemtofarad(double value) {
			return value;
		}

		@Override
		public double toPicofarad(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toNanofarad(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toMicrofarad(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toMillifarad(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double toFarad(double value) {
			return value * 1.0E-15;
		}

		@Override
		public double toKilofarad(double value) {
			return value * 1.0E-18;
		}

		@Override
		public double toMegafarad(double value) {
			return value * 1.0E-21;
		}

		@Override
		public double toGigafarad(double value) {
			return value * 1.0E-24;
		}

		@Override
		public double toTerafarad(double value) {
			return value * 1.0E-27;
		}

		@Override
		public double convert(double source_value, Capacity source_unit) {
			return source_unit.toMicrofarad(source_value);
		}

		@Override
		public String symbol() {
			return "fF";
		}
	},

	PICOFARAD {

		@Override
		public double toFemtofarad(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toPicofarad(double value) {
			return value;
		}

		@Override
		public double toNanofarad(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toMicrofarad(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toMillifarad(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toFarad(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double toKilofarad(double value) {
			return value * 1.0E-15;
		}

		@Override
		public double toMegafarad(double value) {
			return value * 1.0E-18;
		}

		@Override
		public double toGigafarad(double value) {
			return value * 1.0E-21;
		}

		@Override
		public double toTerafarad(double value) {
			return value * 1.0E-24;
		}

		@Override
		public double convert(double source_value, Capacity source_unit) {
			return source_unit.toPicofarad(source_value);
		}

		@Override
		public String symbol() {
			return "pF";
		}
	},

	NANOFARAD {

		@Override
		public double toFemtofarad(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toPicofarad(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toNanofarad(double value) {
			return value;
		}

		@Override
		public double toMicrofarad(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toMillifarad(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toFarad(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toKilofarad(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double toMegafarad(double value) {
			return value * 1.0E-15;
		}

		@Override
		public double toGigafarad(double value) {
			return value * 1.0E-18;
		}

		@Override
		public double toTerafarad(double value) {
			return value * 1.0E-21;
		}

		@Override
		public double convert(double source_value, Capacity source_unit) {
			return source_unit.toNanofarad(source_value);
		}

		@Override
		public String symbol() {
			return "nF";
		}
	},

	MICROFARAD {

		@Override
		public double toFemtofarad(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toPicofarad(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toNanofarad(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toMicrofarad(double value) {
			return value;
		}

		@Override
		public double toMillifarad(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toFarad(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toKilofarad(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toMegafarad(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double toGigafarad(double value) {
			return value * 1.0E-15;
		}

		@Override
		public double toTerafarad(double value) {
			return value * 1.0E-18;
		}

		@Override
		public double convert(double source_value, Capacity source_unit) {
			return source_unit.toMicrofarad(source_value);
		}

		@Override
		public String symbol() {
			return "µF";
		}
	},

	MILLIFARAD {

		@Override
		public double toFemtofarad(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toPicofarad(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toNanofarad(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toMicrofarad(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toMillifarad(double value) {
			return value;
		}

		@Override
		public double toFarad(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toKilofarad(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toMegafarad(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toGigafarad(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double toTerafarad(double value) {
			return value * 1.0E-15;
		}

		@Override
		public double convert(double source_value, Capacity source_unit) {
			return source_unit.toMillifarad(source_value);
		}

		@Override
		public String symbol() {
			return "mF";
		}
	},

	FARAD {

		@Override
		public double toFemtofarad(double value) {
			return value * 1.0E+15;
		}

		@Override
		public double toPicofarad(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toNanofarad(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toMicrofarad(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toMillifarad(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toFarad(double value) {
			return value;
		}

		@Override
		public double toKilofarad(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toGigafarad(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toTerafarad(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double convert(double source_value, Capacity source_unit) {
			return source_unit.toFarad(source_value);
		}

		@Override
		public String symbol() {
			return "F";
		}
	},

	KILOFARAD {

		@Override
		public double toFemtofarad(double value) {
			return value * 1.0E+18;
		}

		@Override
		public double toPicofarad(double value) {
			return value * 1.0E+15;
		}

		@Override
		public double toNanofarad(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toMicrofarad(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toMillifarad(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toFarad(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toKilofarad(double value) {
			return value;
		}

		@Override
		public double toMegafarad(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toGigafarad(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toTerafarad(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double convert(double source_value, Capacity source_unit) {
			return source_unit.toKilofarad(source_value);
		}

		@Override
		public String symbol() {
			return "kF";
		}
	},

	MEGAFARAD {

		@Override
		public double toFemtofarad(double value) {
			return value * 1.0E+21;
		}

		@Override
		public double toPicofarad(double value) {
			return value * 1.0E+18;
		}

		@Override
		public double toNanofarad(double value) {
			return value * 1.0E+15;
		}

		@Override
		public double toMicrofarad(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toMillifarad(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toFarad(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toKilofarad(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toMegafarad(double value) {
			return value;
		}

		@Override
		public double toGigafarad(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toTerafarad(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double convert(double source_value, Capacity source_unit) {
			return source_unit.toMegafarad(source_value);
		}

		@Override
		public String symbol() {
			return "MF";
		}
	},

	GIGAFARAD {

		@Override
		public double toFemtofarad(double value) {
			return value * 1.0E+24;
		}

		@Override
		public double toPicofarad(double value) {
			return value * 1.0E+21;
		}

		@Override
		public double toNanofarad(double value) {
			return value * 1.0E+18;
		}

		@Override
		public double toMicrofarad(double value) {
			return value * 1.0E+15;
		}

		@Override
		public double toMillifarad(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toKilofarad(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toMegafarad(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toGigafarad(double value) {
			return value;
		}

		@Override
		public double toTerafarad(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double convert(double source_value, Capacity source_unit) {
			return source_unit.toGigafarad(source_value);
		}

		@Override
		public String symbol() {
			return "GF";
		}
	},

	TERAFARAD {

		@Override
		public double toFemtofarad(double value) {
			return value * 1.0E+27;
		}

		@Override
		public double toPicofarad(double value) {
			return value * 1.0E+24;
		}

		@Override
		public double toNanofarad(double value) {
			return value * 1.0E+21;
		}

		@Override
		public double toMicrofarad(double value) {
			return value * 1.0E+18;
		}

		@Override
		public double toMillifarad(double value) {
			return value * 1.0E+15;
		}

		@Override
		public double toFarad(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toKilofarad(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toMegafarad(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toGigafarad(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toTerafarad(double value) {
			return value;
		}

		@Override
		public double convert(double source_value, Capacity source_unit) {
			return source_unit.toTerafarad(source_value);
		}

		@Override
		public String symbol() {
			return "TF";
		}
	};

	public double toFemtofarad(double value) {
		throw new AbstractMethodError();
	}

	public double toPicofarad(double value) {
		throw new AbstractMethodError();
	}

	public double toNanofarad(double value) {
		throw new AbstractMethodError();
	}

	public double toMicrofarad(double value) {
		throw new AbstractMethodError();
	}

	public double toMillifarad(double value) {
		throw new AbstractMethodError();
	}

	public double toFarad(double value) {
		throw new AbstractMethodError();
	}

	public double toKilofarad(double value) {
		throw new AbstractMethodError();
	}

	public double toMegafarad(double value) {
		throw new AbstractMethodError();
	}

	public double toGigafarad(double value) {
		throw new AbstractMethodError();
	}

	public double toTerafarad(double value) {
		throw new AbstractMethodError();
	}

	public double convert(double source_value, Capacity source_unit) {
		throw new AbstractMethodError();
	}

	public String symbol() {
		throw new AbstractMethodError();
	}
}
