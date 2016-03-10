package com.ampersand.lcu.math.measurments;

import java.util.Calendar;
import java.util.Date;

public enum Time {

	NANOSECOND {

		@Override
		public double toNanosecond(double value) {
			return value;
		}

		@Override
		public double toMicrosecond(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toMillisecond(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toSecond(double value) {
			return value * 1.0E-9;
		}

		@Override
		public double toMinute(double value) {
			return value * 1.6666666666667E-11;
		}

		@Override
		public double toHour(double value) {
			return value * 2.7777777777778E-13;
		}

		@Override
		public double toDay(double value) {
			return value * 1.1574074074074E-14;
		}

		@Override
		public double toWeek(double value) {
			return value * 1.6534391534392E-15;
		}

		@Override
		public double toMonth(double value) {
			return value * 3.858024691358E-16;
		}

		@Override
		public double toYear(double value) {
			return value * 3.1709791983765E-17;
		}

		@Override
		public double convert(double source_value, Time source_unit) {
			return source_unit.toNanosecond(source_value);
		}

		@Override
		public String symbol() {
			return "ns";
		}
	},

	MICROSECOND {

		@Override
		public double toNanosecond(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toMicrosecond(double value) {
			return value;
		}

		@Override
		public double toMillisecond(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toSecond(double value) {
			return value * 1.0E-6;
		}

		@Override
		public double toMinute(double value) {
			return value * 1.6666666666667E-8;
		}

		@Override
		public double toHour(double value) {
			return value * 2.7777777777778E-10;
		}

		@Override
		public double toDay(double value) {
			return value * 1.1574074074074E-11;
		}

		@Override
		public double toWeek(double value) {
			return value * 1.6534391534392E-12;
		}

		@Override
		public double toMonth(double value) {
			return value * 3.858024691358E-13;
		}

		@Override
		public double toYear(double value) {
			return value * 3.1709791983765E-14;
		}

		@Override
		public double convert(double source_value, Time source_unit) {
			return source_unit.toMicrosecond(source_value);
		}

		@Override
		public String symbol() {
			return "µs";
		}
	},

	MILLISECOND {

		@Override
		public double toNanosecond(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toMicrosecond(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toMillisecond(double value) {
			return value;
		}

		@Override
		public double toSecond(double value) {
			return value * 1.0E-3;
		}

		@Override
		public double toMinute(double value) {
			return value * 1.6666666666667E-5;
		}

		@Override
		public double toHour(double value) {
			return value * 2.7777777777778E-7;
		}

		@Override
		public double toDay(double value) {
			return value * 1.1574074074074E-8;
		}

		@Override
		public double toWeek(double value) {
			return value * 1.6534391534392E-9;
		}

		@Override
		public double toMonth(double value) {
			return value * 3.858024691358E-10;
		}

		@Override
		public double toYear(double value) {
			return value * 3.1709791983765E-11;
		}

		@Override
		public double convert(double source_value, Time source_unit) {
			return source_unit.toMillisecond(source_value);
		}

		@Override
		public String symbol() {
			return "ms";
		}
	},

	SECOND {

		@Override
		public double toNanosecond(double value) {
			return value * 1.0E+9;
		}

		@Override
		public double toMicrosecond(double value) {
			return value * 1.0E+6;
		}

		@Override
		public double toMillisecond(double value) {
			return value * 1.0E+3;
		}

		@Override
		public double toSecond(double value) {
			return value;
		}

		@Override
		public double toMinute(double value) {
			return value * 0.016666666666667;
		}

		@Override
		public double toHour(double value) {
			return value * 0.00027777777777778;
		}

		@Override
		public double toDay(double value) {
			return value * 1.1574074074074E-5;
		}

		@Override
		public double toWeek(double value) {
			return value * 1.6534391534392E-6;
		}

		@Override
		public double toMonth(double value) {
			return value * 3.858024691358E-7;
		}

		@Override
		public double toYear(double value) {
			return value * 3.1709791983765E-8;
		}

		@Override
		public double convert(double source_value, Time source_unit) {
			return source_unit.toSecond(source_value);
		}

		@Override
		public String symbol() {
			return "s";
		}
	},

	MINUTE {

		@Override
		public double toNanosecond(double value) {
			return value * 6.0E+10;
		}

		@Override
		public double toMicrosecond(double value) {
			return value * 6.0E+7;
		}

		@Override
		public double toMillisecond(double value) {
			return value * 6.0E+4;
		}

		@Override
		public double toSecond(double value) {
			return value * 60;
		}

		@Override
		public double toMinute(double value) {
			return value;
		}

		@Override
		public double toHour(double value) {
			return value * 0.016666666666667;
		}

		@Override
		public double toDay(double value) {
			return value * 0.00069444444444444;
		}

		@Override
		public double toWeek(double value) {
			return value * 9.9206349206349E-5;
		}

		@Override
		public double toMonth(double value) {
			return value * 2.3148148148148E-5;
		}

		@Override
		public double toYear(double value) {
			return value * 1.9025875190259E-6;
		}

		@Override
		public double convert(double source_value, Time source_unit) {
			return source_unit.toMinute(source_value);
		}

		@Override
		public String symbol() {
			return "mn";
		}
	},

	HOUR {

		@Override
		public double toNanosecond(double value) {
			return value * 36.0E+11;
		}

		@Override
		public double toMicrosecond(double value) {
			return value * 36.0E+8;
		}

		@Override
		public double toMillisecond(double value) {
			return value * 36.0E+5;
		}

		@Override
		public double toSecond(double value) {
			return value * 3600;
		}

		@Override
		public double toMinute(double value) {
			return value * 60;
		}

		@Override
		public double toHour(double value) {
			return value;
		}

		@Override
		public double toDay(double value) {
			return value * 0.041666666666667;
		}

		@Override
		public double toWeek(double value) {
			return value * 0.005952380952381;
		}

		@Override
		public double toMonth(double value) {
			return value * 0.0013888888888889;
		}

		@Override
		public double toYear(double value) {
			return value * 0.00011415525114155;
		}

		@Override
		public double convert(double source_value, Time source_unit) {
			return source_unit.toHour(source_value);
		}

		@Override
		public String symbol() {
			return "h";
		}
	},

	DAY {

		@Override
		public double toNanosecond(double value) {
			return value * 864.0E+11;
		}

		@Override
		public double toMicrosecond(double value) {
			return value * 864.0E+8;
		}

		@Override
		public double toMillisecond(double value) {
			return value * 86400000;
		}

		@Override
		public double toSecond(double value) {
			return value * 86400;
		}

		@Override
		public double toMinute(double value) {
			return value * 1440;
		}

		@Override
		public double toHour(double value) {
			return value * 24;
		}

		@Override
		public double toDay(double value) {
			return value;
		}

		@Override
		public double toWeek(double value) {
			return value * 0.14285714285714;
		}

		@Override
		public double toMonth(double value) {
			return value * 0.033333333333333;
		}

		@Override
		public double toYear(double value) {
			return value * 0.0027397260273973;
		}

		@Override
		public double convert(double source_value, Time source_unit) {
			return source_unit.toDay(source_value);
		}

		@Override
		public String symbol() {
			return "d";
		}
	},

	WEEK {

		@Override
		public double toNanosecond(double value) {
			return value * 6048.0E+14;
		}

		@Override
		public double toMicrosecond(double value) {
			return value * 6048.0E+8;
		}

		@Override
		public double toMillisecond(double value) {
			return value * 604800000;
		}

		@Override
		public double toSecond(double value) {
			return value * 604800;
		}

		@Override
		public double toMinute(double value) {
			return value * 10080;
		}

		@Override
		public double toHour(double value) {
			return value * 168;
		}

		@Override
		public double toDay(double value) {
			return value * 7;
		}

		@Override
		public double toWeek(double value) {
			return value;
		}

		@Override
		public double toMonth(double value) {
			return value * 0.23333333333333;
		}

		@Override
		public double toYear(double value) {
			return value * 0.019178082191781;
		}

		@Override
		public double convert(double source_value, Time source_unit) {
			return source_unit.toWeek(source_value);
		}

		@Override
		public String symbol() {
			return "w";
		}
	},

	MONTH {

		@Override
		public double toNanosecond(double value) {
			return value * 2592.0E+15;
		}

		@Override
		public double toMicrosecond(double value) {
			return value * 2592.0E+9;
		}

		@Override
		public double toMillisecond(double value) {
			return value * 2592.0E+6;
		}

		@Override
		public double toSecond(double value) {
			return value * 2592000;
		}

		@Override
		public double toMinute(double value) {
			return value * 43200;
		}

		@Override
		public double toHour(double value) {
			return value * 720;
		}

		@Override
		public double toDay(double value) {
			return value * 30;
		}

		@Override
		public double toWeek(double value) {
			return value * 4.2857142857143;
		}

		@Override
		public double toMonth(double value) {
			return value;
		}

		@Override
		public double toYear(double value) {
			return value * 0.082191780821918;
		}

		@Override
		public double convert(double source_value, Time source_unit) {
			return source_unit.toMonth(source_value);
		}

		@Override
		public String symbol() {
			return "m";
		}
	},

	YEAR {

		@Override
		public double toNanosecond(double value) {
			return value * 31536.0E+16;
		}

		@Override
		public double toMicrosecond(double value) {
			return value * 31536.0E+9;
		}

		@Override
		public double toMillisecond(double value) {
			return value * 31536.0E+6;
		}

		@Override
		public double toSecond(double value) {
			return value * 31536.0E+3;
		}

		@Override
		public double toMinute(double value) {
			return value * 525600;
		}

		@Override
		public double toHour(double value) {
			return value * 8760;
		}

		@Override
		public double toDay(double value) {
			return value * 365;
		}

		@Override
		public double toWeek(double value) {
			return value * 52.142857142857;
		}

		@Override
		public double toMonth(double value) {
			return value * 12.166666666667;
		}

		@Override
		public double toYear(double value) {
			return value;
		}

		@Override
		public double convert(double source_value, Time source_unit) {
			return source_unit.toYear(source_value);
		}

		@Override
		public String symbol() {
			return "y";
		}
	};

	public double toNanosecond(double value) {
		throw new AbstractMethodError();
	}

	public double toMicrosecond(double value) {
		throw new AbstractMethodError();
	}

	public double toMillisecond(double value) {
		throw new AbstractMethodError();
	}

	public double toSecond(double value) {
		throw new AbstractMethodError();
	}

	public double toMinute(double value) {
		throw new AbstractMethodError();
	}

	public double toHour(double value) {
		throw new AbstractMethodError();
	}

	public double toDay(double value) {
		throw new AbstractMethodError();
	}

	public double toWeek(double value) {
		throw new AbstractMethodError();
	}

	public double toMonth(double value) {
		throw new AbstractMethodError();
	}

	public double toYear(double value) {
		throw new AbstractMethodError();
	}

	public double convert(double source_value, Time source_unit) {
		throw new AbstractMethodError();
	}

	public String symbol() {
		throw new AbstractMethodError();
	}

	public static double elapsedTime(Date first_date, Date second_date, Time unit) {

		double result = 0;
		final long first = first_date.getTime();
		final long second = second_date.getTime();

		final Calendar first_calendar = Calendar.getInstance();
		final Calendar second_calendar = Calendar.getInstance();

		if (second > first) {

			first_calendar.setTime(second_date);
			second_calendar.setTime(first_date);
		} else {

			first_calendar.setTime(first_date);
			second_calendar.setTime(second_date);
		}

		result += unit.convert(first_calendar.get(Calendar.YEAR) - second_calendar.get(Calendar.YEAR), Time.YEAR);
		result += unit.convert(first_calendar.get(Calendar.MONTH) - second_calendar.get(Calendar.MONTH), Time.MONTH);
		result += unit.convert(first_calendar.get(Calendar.DAY_OF_MONTH) - second_calendar.get(Calendar.DAY_OF_MONTH),
				Time.DAY);
		result += unit.convert(first_calendar.get(Calendar.HOUR) - second_calendar.get(Calendar.HOUR), Time.HOUR);
		result += unit.convert(first_calendar.get(Calendar.MINUTE) - second_calendar.get(Calendar.MINUTE), Time.MINUTE);
		result += unit.convert(first_calendar.get(Calendar.SECOND) - second_calendar.get(Calendar.SECOND), Time.SECOND);

		return result;
	}
}
