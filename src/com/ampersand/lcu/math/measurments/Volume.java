package com.ampersand.lcu.math.measurments;

public enum Volume {

	MILLILITER {

		@Override
		public double toMilliliter(double value) {
			return value;
		}

		@Override
		public double toCentiliter(double value) {
			return value * 0.1;
		}

		@Override
		public double toDeciliter(double value) {
			return value * 0.01;
		}

		@Override
		public double toLiter(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toCubicCentimeter(double value) {
			return value;
		}

		@Override
		public double toCubicDecimeter(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toCubicMeter(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double convert(double source_value, Volume source_unit) {
			return source_unit.toMilliliter(source_value);
		}

		@Override
		public String symbol() {
			return "ml";
		}
	},

	CENTILITER {

		@Override
		public double toMilliliter(double value) {
			return value * 10;
		}

		@Override
		public double toCentiliter(double value) {
			return value;
		}

		@Override
		public double toDeciliter(double value) {
			return value * 0.1;
		}

		@Override
		public double toLiter(double value) {
			return value * 0.01;
		}

		@Override
		public double toCubicCentimeter(double value) {
			return value * 10;
		}

		@Override
		public double toCubicDecimeter(double value) {
			return value * 0.01;
		}

		@Override
		public double toCubicMeter(double value) {
			return value * 1.0E-5;
		}

		@Override
		public double convert(double source_value, Volume source_unit) {
			return source_unit.toCentiliter(source_value);
		}

		@Override
		public String symbol() {
			return "cl";
		}
	},

	DECILITER {

		@Override
		public double toMilliliter(double value) {
			return value * 100;
		}

		@Override
		public double toCentiliter(double value) {
			return value * 10;
		}

		@Override
		public double toDeciliter(double value) {
			return value;
		}

		@Override
		public double toLiter(double value) {
			return value * 0.1;
		}

		@Override
		public double toCubicCentimeter(double value) {
			return value * 100;
		}

		@Override
		public double toCubicDecimeter(double value) {
			return value * 0.1;
		}

		@Override
		public double toCubicMeter(double value) {
			return value * 1.0E-4;
		}

		@Override
		public double convert(double source_value, Volume source_unit) {
			return source_unit.toDeciliter(source_value);
		}

		@Override
		public String symbol() {
			return "dl";
		}
	},

	LITER {

		@Override
		public double toMilliliter(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toCentiliter(double value) {
			return value * 100;
		}

		@Override
		public double toDeciliter(double value) {
			return value * 10;
		}

		@Override
		public double toLiter(double value) {
			return value;
		}

		@Override
		public double toCubicCentimeter(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toCubicDecimeter(double value) {
			return value;
		}

		@Override
		public double toCubicMeter(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double convert(double source_value, Volume source_unit) {
			return source_unit.toLiter(source_value);
		}

		@Override
		public String symbol() {
			return "l";
		}
	},

	CUBIC_CENTIMETER {

		@Override
		public double toMilliliter(double value) {
			return value;
		}

		@Override
		public double toCentiliter(double value) {
			return value;
		}

		@Override
		public double toDeciliter(double value) {
			return value * 0.01;
		}

		@Override
		public double toLiter(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toCubicCentimeter(double value) {
			return value;
		}

		@Override
		public double toCubicDecimeter(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toCubicMeter(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double convert(double source_value, Volume source_unit) {
			return source_unit.toCubicCentimeter(source_value);
		}

		@Override
		public String symbol() {
			return "cm3";
		}
	},

	CUBIC_DECIMETER {

		@Override
		public double toMilliliter(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toCentiliter(double value) {
			return value * 100;
		}

		@Override
		public double toDeciliter(double value) {
			return value * 10;
		}

		@Override
		public double toLiter(double value) {
			return value;
		}

		@Override
		public double toCubicCentimeter(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toCubicDecimeter(double value) {
			return value;
		}

		@Override
		public double toCubicMeter(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double convert(double source_value, Volume source_unit) {
			return source_unit.toCubicDecimeter(source_value);
		}

		@Override
		public String symbol() {
			return "dm3";
		}
	},

	CUBIC_METER {

		@Override
		public double toMilliliter(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toCentiliter(double value) {
			return value * 1.0E+5;
		}

		@Override
		public double toDeciliter(double value) {
			return value * 1.0E+4;
		}

		@Override
		public double toLiter(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toCubicCentimeter(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toCubicDecimeter(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toCubicMeter(double value) {
			return value;
		}

		@Override
		public double convert(double source_value, Volume source_unit) {
			return source_unit.toCubicMeter(source_value);
		}

		@Override
		public String symbol() {
			return "m3";
		}
	};

	public double toMilliliter(double value) {
		throw new AbstractMethodError();
	}

	public double toCentiliter(double value) {
		throw new AbstractMethodError();
	}

	public double toDeciliter(double value) {
		throw new AbstractMethodError();
	}

	public double toLiter(double value) {
		throw new AbstractMethodError();
	}

	public double toCubicCentimeter(double value) {
		throw new AbstractMethodError();
	}

	public double toCubicDecimeter(double value) {
		throw new AbstractMethodError();
	}

	public double toCubicMeter(double value) {
		throw new AbstractMethodError();
	}

	public double convert(double source_value, Volume source_unit) {
		throw new AbstractMethodError();
	}

	public String symbol() {
		throw new AbstractMethodError();
	}
}
