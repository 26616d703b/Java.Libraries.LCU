package com.ampersand.lcu.math.measurments;

public enum Length {

	NANOMETER {

		@Override
		public double toNanometer(double value) {
			return value;
		}

		@Override
		public double toMicrometer(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toMillimeter(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toCentimeter(double value) {
			return value * 1.0E-7;
		}

		@Override
		public double toDecimeter(double value) {
			return value * 1.0E-8;
		}

		@Override
		public double toMeter(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toDecameter(double value) {
			return value * 1.0E-10;
		}

		@Override
		public double toHectometer(double value) {
			return value * 1.0E-11;
		}

		@Override
		public double toKilometer(double value) {
			return value * 1.0E-12;
		}

		@Override
		public double toMile(double value) {
			return value * 6.2137119223733E-13;
		}

		@Override
		public double toInch(double value) {
			return value * 2.54E+7;
		}

		@Override
		public double convert(double source_value, Length source_unit) {
			return source_unit.toNanometer(source_value);
		}

		@Override
		public String symbol() {
			return "nm";
		}
	},

	MICROMETER {

		@Override
		public double toNanometer(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toMicrometer(double value) {
			return value;
		}

		@Override
		public double toMillimeter(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toCentimeter(double value) {
			return value * 1.0E-4;
		}

		@Override
		public double toDecimeter(double value) {
			return value * 1.0E-5;
		}

		@Override
		public double toMeter(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toDecameter(double value) {
			return value * 1.0E-7;
		}

		@Override
		public double toHectometer(double value) {
			return value * 1.0E-8;
		}

		@Override
		public double toKilometer(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toMile(double value) {
			return value * 6.2137119223733E-10;
		}

		@Override
		public double toInch(double value) {
			return value * 2.54E+4;
		}

		@Override
		public double convert(double source_value, Length source_unit) {
			return source_unit.toMicrometer(source_value);
		}

		@Override
		public String symbol() {
			return "µm";
		}
	},

	MILLIMETER {

		@Override
		public double toNanometer(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toMicrometer(double value) {
			return value * 100;
		}

		@Override
		public double toMillimeter(double value) {
			return value;
		}

		@Override
		public double toCentimeter(double value) {
			return value * 0.1;
		}

		@Override
		public double toDecimeter(double value) {
			return value * 0.01;
		}

		@Override
		public double toMeter(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toDecameter(double value) {
			return value * 1.0E-4;
		}

		@Override
		public double toHectometer(double value) {
			return value * 1.0E-5;
		}

		@Override
		public double toKilometer(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toMile(double value) {
			return value * 6.2137119223733E-7;
		}

		@Override
		public double toInch(double value) {
			return value * 25.4;
		}

		@Override
		public double convert(double source_value, Length source_unit) {
			return source_unit.toMillimeter(source_value);
		}

		@Override
		public String symbol() {
			return "mm";
		}
	},

	CENTIMETER {

		@Override
		public double toNanometer(double value) {
			return value * 1.0E+7;
		}

		@Override
		public double toMicrometer(double value) {
			return value * 1.0E+4;
		}

		@Override
		public double toMillimeter(double value) {
			return value * 10;
		}

		@Override
		public double toCentimeter(double value) {
			return value;
		}

		@Override
		public double toDecimeter(double value) {
			return value * 0.1;
		}

		@Override
		public double toMeter(double value) {
			return value * 0.01;
		}

		@Override
		public double toDecameter(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toHectometer(double value) {
			return value * 1.0E-4;
		}

		@Override
		public double toKilometer(double value) {
			return value * 1.0E-5;
		}

		@Override
		public double toMile(double value) {
			return value * 6.2137119223733E-6;
		}

		@Override
		public double toInch(double value) {
			return value * 2.54;
		}

		@Override
		public double convert(double source_value, Length source_unit) {
			return source_unit.toCentimeter(source_value);
		}

		@Override
		public String symbol() {
			return "cm";
		}
	},

	DECIMETER {

		@Override
		public double toNanometer(double value) {
			return value * 1.0E+8;
		}

		@Override
		public double toMicrometer(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toMillimeter(double value) {
			return value * 100;
		}

		@Override
		public double toCentimeter(double value) {
			return value * 10;
		}

		@Override
		public double toDecimeter(double value) {
			return value;
		}

		@Override
		public double toMeter(double value) {
			return value * 0.1;
		}

		@Override
		public double toDecameter(double value) {
			return value * 0.01;
		}

		@Override
		public double toHectometer(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toKilometer(double value) {
			return value * 1.0E-4;
		}

		@Override
		public double toMile(double value) {
			return value * 6.2137119223733E-5;
		}

		@Override
		public double toInch(double value) {
			return value * 0.254;
		}

		@Override
		public double convert(double source_value, Length source_unit) {
			return source_unit.toDecimeter(source_value);
		}

		@Override
		public String symbol() {
			return "dm";
		}
	},

	METER {

		@Override
		public double toNanometer(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toMicrometer(double value) {
			return value * 1.0E+4;
		}

		@Override
		public double toMillimeter(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toCentimeter(double value) {
			return value * 100;
		}

		@Override
		public double toDecimeter(double value) {
			return value * 10;
		}

		@Override
		public double toMeter(double value) {
			return value;
		}

		@Override
		public double toDecameter(double value) {
			return value * 0.1;
		}

		@Override
		public double toHectometer(double value) {
			return value * 0.01;
		}

		@Override
		public double toKilometer(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toMile(double value) {
			return value * 6.2137119223733E-4;
		}

		@Override
		public double toInch(double value) {
			return value * 0.0254;
		}

		@Override
		public double convert(double source_value, Length source_unit) {
			return source_unit.toMeter(source_value);
		}

		@Override
		public String symbol() {
			return "m";
		}
	},

	DECAMETER {

		@Override
		public double toNanometer(double value) {
			return value * 1.0E+10;
		}

		@Override
		public double toMicrometer(double value) {
			return value * 1.0E+5;
		}

		@Override
		public double toMillimeter(double value) {
			return value * 1.0E+4;
		}

		@Override
		public double toCentimeter(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toDecimeter(double value) {
			return value * 100;
		}

		@Override
		public double toMeter(double value) {
			return value * 10;
		}

		@Override
		public double toDecameter(double value) {
			return value;
		}

		@Override
		public double toHectometer(double value) {
			return value * 0.1;
		}

		@Override
		public double toKilometer(double value) {
			return value * 0.01;
		}

		@Override
		public double toMile(double value) {
			return value * 6.2137119223733E-3;
		}

		@Override
		public double toInch(double value) {
			return value * 2.54E-3;
		}

		@Override
		public double convert(double source_value, Length source_unit) {
			return source_unit.toDecameter(source_value);
		}

		@Override
		public String symbol() {
			return "dam";
		}
	},

	HECTOMETER {

		@Override
		public double toNanometer(double value) {
			return value * 1.0E+11;
		}

		@Override
		public double toMicrometer(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toMillimeter(double value) {
			return value * 1.0E+5;
		}

		@Override
		public double toCentimeter(double value) {
			return value * 1.0E+4;
		}

		@Override
		public double toDecimeter(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toMeter(double value) {
			return value * 100;
		}

		@Override
		public double toDecameter(double value) {
			return value * 10;
		}

		@Override
		public double toHectometer(double value) {
			return value;
		}

		@Override
		public double toKilometer(double value) {
			return value * 0.1;
		}

		@Override
		public double toMile(double value) {
			return value * 0.062137119223733;
		}

		@Override
		public double toInch(double value) {
			return value * 2.54E-4;
		}

		@Override
		public double convert(double source_value, Length source_unit) {
			return source_unit.toHectometer(source_value);
		}

		@Override
		public String symbol() {
			return "hm";
		}
	},

	KILOMETER {

		@Override
		public double toNanometer(double value) {
			return value * 1.0E+12;
		}

		@Override
		public double toMicrometer(double value) {
			return value * 1.0E+7;
		}

		@Override
		public double toMillimeter(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toCentimeter(double value) {
			return value * 1.0E+5;
		}

		@Override
		public double toDecimeter(double value) {
			return value * 1.0E+4;
		}

		@Override
		public double toMeter(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toDecameter(double value) {
			return value * 100;
		}

		@Override
		public double toHectometer(double value) {
			return value * 10;
		}

		@Override
		public double toKilometer(double value) {
			return value;
		}

		@Override
		public double toMile(double value) {
			return value * 0.62137119223733;
		}

		@Override
		public double toInch(double value) {
			return value * 2.54E-5;
		}

		@Override
		public double convert(double source_value, Length source_unit) {
			return source_unit.toKilometer(source_value);
		}

		@Override
		public String symbol() {
			return "km";
		}
	},

	MILE {

		@Override
		public double toNanometer(double value) {
			return value * 1609344E+6;
		}

		@Override
		public double toMicrometer(double value) {
			return value * 1609344E+3;
		}

		@Override
		public double toMillimeter(double value) {
			return value * 1609344;
		}

		@Override
		public double toCentimeter(double value) {
			return value * 160934.4;
		}

		@Override
		public double toDecimeter(double value) {
			return value * 16093.44;
		}

		@Override
		public double toMeter(double value) {
			return value * 1609344E-3;
		}

		@Override
		public double toDecameter(double value) {
			return value * 1609344E-4;
		}

		@Override
		public double toHectometer(double value) {
			return value * 1609344E-5;
		}

		@Override
		public double toKilometer(double value) {
			return value * 1609344E-6;
		}

		@Override
		public double toMile(double value) {
			return value;
		}

		@Override
		public double toInch(double value) {
			return value * 1.5782828282828E+5;
		}

		@Override
		public double convert(double source_value, Length source_unit) {
			return source_unit.toMile(source_value);
		}

		@Override
		public String symbol() {
			return "mi";
		}
	},

	INCH {

		@Override
		public double toNanometer(double value) {
			return value * 2.54E+7;
		}

		@Override
		public double toMicrometer(double value) {
			return value * 2.54E+4;
		}

		@Override
		public double toMillimeter(double value) {
			return value * 25.4;
		}

		@Override
		public double toCentimeter(double value) {
			return value * 2.54;
		}

		@Override
		public double toDecimeter(double value) {
			return value * 0.254;
		}

		@Override
		public double toMeter(double value) {
			return value * 0.0254;
		}

		@Override
		public double toDecameter(double value) {
			return value * 2.54E-3;
		}

		@Override
		public double toHectometer(double value) {
			return value * 2.54E-4;
		}

		@Override
		public double toKilometer(double value) {
			return value * 2.54E-5;
		}

		@Override
		public double toMile(double value) {
			return value * 1.5782828282828;
		}

		@Override
		public double toInch(double value) {
			return value;
		}

		@Override
		public double convert(double source_value, Length source_unit) {
			return source_unit.toMile(source_value);
		}

		@Override
		public String symbol() {
			return "in";
		}
	};

	public double toNanometer(double value) {
		throw new AbstractMethodError();
	}

	public double toMicrometer(double value) {
		throw new AbstractMethodError();
	}

	public double toMillimeter(double value) {
		throw new AbstractMethodError();
	}

	public double toCentimeter(double value) {
		throw new AbstractMethodError();
	}

	public double toDecimeter(double value) {
		throw new AbstractMethodError();
	}

	public double toMeter(double value) {
		throw new AbstractMethodError();
	}

	public double toDecameter(double value) {
		throw new AbstractMethodError();
	}

	public double toHectometer(double value) {
		throw new AbstractMethodError();
	}

	public double toKilometer(double value) {
		throw new AbstractMethodError();
	}

	public double toMile(double value) {
		throw new AbstractMethodError();
	}

	public double toInch(double value) {
		throw new AbstractMethodError();
	}

	public double convert(double source_value, Length source_unit) {
		throw new AbstractMethodError();
	}

	public String symbol() {
		throw new AbstractMethodError();
	}
}
