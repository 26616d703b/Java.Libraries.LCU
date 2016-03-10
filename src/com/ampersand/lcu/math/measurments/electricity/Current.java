package com.ampersand.lcu.math.measurments.electricity;

public enum Current {

	FEMTOAMPERE {

		@Override
		public double toFemtoampere(double value) {
			return value;
		}

		@Override
		public double toPicoampere(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toNanoampere(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toMicroampere(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toMilliampere(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double toAmpere(double value) {
			return value * 1.0E-15;
		}

		@Override
		public double toAbampere(double value) {
			return value * 1.0E-16;
		}

		@Override
		public double toKiloampere(double value) {
			return value * 1.0E-18;
		}

		@Override
		public double toMegaampere(double value) {
			return value * 1.0E-21;
		}

		@Override
		public double toGigaampere(double value) {
			return value * 1.0E-24;
		}

		@Override
		public double toTeraampere(double value) {
			return value * 1.0E-27;
		}

		@Override
		public double convert(double source_value, Current source_unit) {
			return source_unit.toMicroampere(source_value);
		}

		@Override
		public String symbol() {
			return "fA";
		}
	},

	PICOAMPERE {

		@Override
		public double toFemtoampere(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toPicoampere(double value) {
			return value;
		}

		@Override
		public double toNanoampere(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toMicroampere(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toMilliampere(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toAmpere(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double toAbampere(double value) {
			return value * 1.0E-13;
		}

		@Override
		public double toKiloampere(double value) {
			return value * 1.0E-15;
		}

		@Override
		public double toMegaampere(double value) {
			return value * 1.0E-18;
		}

		@Override
		public double toGigaampere(double value) {
			return value * 1.0E-21;
		}

		@Override
		public double toTeraampere(double value) {
			return value * 1.0E-24;
		}

		@Override
		public double convert(double source_value, Current source_unit) {
			return source_unit.toPicoampere(source_value);
		}

		@Override
		public String symbol() {
			return "pA";
		}
	},

	NANOAMPERE {

		@Override
		public double toFemtoampere(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toPicoampere(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toNanoampere(double value) {
			return value;
		}

		@Override
		public double toMicroampere(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toMilliampere(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toAmpere(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toAbampere(double value) {
			return value * 1.0E-10;
		}

		@Override
		public double toKiloampere(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double toMegaampere(double value) {
			return value * 1.0E-15;
		}

		@Override
		public double toGigaampere(double value) {
			return value * 1.0E-18;
		}

		@Override
		public double toTeraampere(double value) {
			return value * 1.0E-21;
		}

		@Override
		public double convert(double source_value, Current source_unit) {
			return source_unit.toNanoampere(source_value);
		}

		@Override
		public String symbol() {
			return "nA";
		}
	},

	MICROAMPERE {

		@Override
		public double toFemtoampere(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toPicoampere(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toNanoampere(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toMicroampere(double value) {
			return value;
		}

		@Override
		public double toMilliampere(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toAmpere(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toAbampere(double value) {
			return value * 1.0E-5;
		}

		@Override
		public double toKiloampere(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toMegaampere(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double toGigaampere(double value) {
			return value * 1.0E-15;
		}

		@Override
		public double toTeraampere(double value) {
			return value * 1.0E-18;
		}

		@Override
		public double convert(double source_value, Current source_unit) {
			return source_unit.toMicroampere(source_value);
		}

		@Override
		public String symbol() {
			return "µA";
		}
	},

	MILLIAMPERE {

		@Override
		public double toFemtoampere(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toPicoampere(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toNanoampere(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toMicroampere(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toMilliampere(double value) {
			return value;
		}

		@Override
		public double toAmpere(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toAbampere(double value) {
			return value * 1.0E-4;
		}

		@Override
		public double toKiloampere(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toMegaampere(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toGigaampere(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double toTeraampere(double value) {
			return value * 1.0E-15;
		}

		@Override
		public double convert(double source_value, Current source_unit) {
			return source_unit.toMilliampere(source_value);
		}

		@Override
		public String symbol() {
			return "mA";
		}
	},

	AMPERE {

		@Override
		public double toFemtoampere(double value) {
			return value * 1.0E+15;
		}

		@Override
		public double toPicoampere(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toNanoampere(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toMicroampere(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toMilliampere(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toAmpere(double value) {
			return value;
		}

		@Override
		public double toAbampere(double value) {
			return value * 0.1;
		}

		@Override
		public double toKiloampere(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toGigaampere(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toTeraampere(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double convert(double source_value, Current source_unit) {
			return source_unit.toAmpere(source_value);
		}

		@Override
		public String symbol() {
			return "A";
		}
	},

	ABAMPERE {

		@Override
		public double toFemtoampere(double value) {
			return value * 1.0E+16;
		}

		@Override
		public double toPicoampere(double value) {
			return value * 1.0E+13;
		}

		@Override
		public double toNanoampere(double value) {
			return value * 1.0E+10;
		}

		@Override
		public double toMicroampere(double value) {
			return value * 1.0E+7;
		}

		@Override
		public double toMilliampere(double value) {
			return value * 1.0E+4;
		}

		@Override
		public double toAmpere(double value) {
			return value * 10;
		}

		@Override
		public double toAbampere(double value) {
			return value;
		}

		@Override
		public double toKiloampere(double value) {
			return value * 0.01;
		}

		@Override
		public double toMegaampere(double value) {
			return value * 1.0E-5;
		}

		@Override
		public double toGigaampere(double value) {
			return value * 1.0E-8;
		}

		@Override
		public double toTeraampere(double value) {
			return value * 1.0E-11;
		}

		@Override
		public double convert(double source_value, Current source_unit) {
			return source_unit.toAbampere(source_value);
		}

		@Override
		public String symbol() {
			return "abA";
		}
	},

	KILOAMPERE {

		@Override
		public double toFemtoampere(double value) {
			return value * 1.0E+18;
		}

		@Override
		public double toPicoampere(double value) {
			return value * 1.0E+15;
		}

		@Override
		public double toNanoampere(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toMicroampere(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toMilliampere(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toAmpere(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toAbampere(double value) {
			return value * 100;
		}

		@Override
		public double toKiloampere(double value) {
			return value;
		}

		@Override
		public double toMegaampere(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toGigaampere(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toTeraampere(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double convert(double source_value, Current source_unit) {
			return source_unit.toKiloampere(source_value);
		}

		@Override
		public String symbol() {
			return "kA";
		}
	},

	MEGAAMPERE {

		@Override
		public double toFemtoampere(double value) {
			return value * 1.0E+21;
		}

		@Override
		public double toPicoampere(double value) {
			return value * 1.0E+18;
		}

		@Override
		public double toNanoampere(double value) {
			return value * 1.0E+15;
		}

		@Override
		public double toMicroampere(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toMilliampere(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toAmpere(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toAbampere(double value) {
			return value * 1.0E+5;
		}

		@Override
		public double toKiloampere(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toMegaampere(double value) {
			return value;
		}

		@Override
		public double toGigaampere(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toTeraampere(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double convert(double source_value, Current source_unit) {
			return source_unit.toMegaampere(source_value);
		}

		@Override
		public String symbol() {
			return "MA";
		}
	},

	GIGAAMPERE {

		@Override
		public double toFemtoampere(double value) {
			return value * 1.0E+24;
		}

		@Override
		public double toPicoampere(double value) {
			return value * 1.0E+21;
		}

		@Override
		public double toNanoampere(double value) {
			return value * 1.0E+18;
		}

		@Override
		public double toMicroampere(double value) {
			return value * 1.0E+15;
		}

		@Override
		public double toMilliampere(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toAmpere(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toAbampere(double value) {
			return value * 1.0E+8;
		}

		@Override
		public double toKiloampere(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toMegaampere(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toGigaampere(double value) {
			return value;
		}

		@Override
		public double toTeraampere(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double convert(double source_value, Current source_unit) {
			return source_unit.toGigaampere(source_value);
		}

		@Override
		public String symbol() {
			return "GA";
		}
	},

	TERAAMPERE {

		@Override
		public double toFemtoampere(double value) {
			return value * 1.0E+27;
		}

		@Override
		public double toPicoampere(double value) {
			return value * 1.0E+24;
		}

		@Override
		public double toNanoampere(double value) {
			return value * 1.0E+21;
		}

		@Override
		public double toMicroampere(double value) {
			return value * 1.0E+18;
		}

		@Override
		public double toMilliampere(double value) {
			return value * 1.0E+15;
		}

		@Override
		public double toAmpere(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toAbampere(double value) {
			return value * 1.0E+11;
		}

		@Override
		public double toKiloampere(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toMegaampere(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toGigaampere(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toTeraampere(double value) {
			return value;
		}

		@Override
		public double convert(double source_value, Current source_unit) {
			return source_unit.toTeraampere(source_value);
		}

		@Override
		public String symbol() {
			return "TA";
		}
	};

	public double toFemtoampere(double value) {
		throw new AbstractMethodError();
	}

	public double toPicoampere(double value) {
		throw new AbstractMethodError();
	}

	public double toNanoampere(double value) {
		throw new AbstractMethodError();
	}

	public double toMicroampere(double value) {
		throw new AbstractMethodError();
	}

	public double toMilliampere(double value) {
		throw new AbstractMethodError();
	}

	public double toAmpere(double value) {
		throw new AbstractMethodError();
	}

	public double toAbampere(double value) {
		throw new AbstractMethodError();
	}

	public double toKiloampere(double value) {
		throw new AbstractMethodError();
	}

	public double toMegaampere(double value) {
		throw new AbstractMethodError();
	}

	public double toGigaampere(double value) {
		throw new AbstractMethodError();
	}

	public double toTeraampere(double value) {
		throw new AbstractMethodError();
	}

	public double convert(double source_value, Current source_unit) {
		throw new AbstractMethodError();
	}

	public String symbol() {
		throw new AbstractMethodError();
	}
}
