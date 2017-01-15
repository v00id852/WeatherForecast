package com.club.lza852.weatherforecast.API;

import java.util.List;

/**
 * Created by ziang on 2017/1/15.
 */

public class ForecastModel {

    /**
     * status : ok
     * lang : zh_CN
     * result : {"hourly":{"status":"ok","description":"多云，明天下午16点钟后转晴","skycon":[{"value":"CLOUDY","datetime":"2017-01-15 23:00"},{"value":"CLOUDY","datetime":"2017-01-16 00:00"},{"value":"CLOUDY","datetime":"2017-01-16 01:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2017-01-16 02:00"},{"value":"CLOUDY","datetime":"2017-01-16 03:00"},{"value":"CLOUDY","datetime":"2017-01-16 04:00"},{"value":"CLOUDY","datetime":"2017-01-16 05:00"},{"value":"CLOUDY","datetime":"2017-01-16 06:00"},{"value":"CLOUDY","datetime":"2017-01-16 07:00"},{"value":"CLOUDY","datetime":"2017-01-16 08:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2017-01-16 09:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2017-01-16 10:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 11:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 12:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 13:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 14:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 15:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 16:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 17:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 18:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 19:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 20:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 21:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 22:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 23:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 00:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 01:00"},{"value":"HAZE","datetime":"2017-01-17 02:00"},{"value":"HAZE","datetime":"2017-01-17 03:00"},{"value":"HAZE","datetime":"2017-01-17 04:00"},{"value":"HAZE","datetime":"2017-01-17 05:00"},{"value":"HAZE","datetime":"2017-01-17 06:00"},{"value":"HAZE","datetime":"2017-01-17 07:00"},{"value":"HAZE","datetime":"2017-01-17 08:00"},{"value":"HAZE","datetime":"2017-01-17 09:00"},{"value":"HAZE","datetime":"2017-01-17 10:00"},{"value":"HAZE","datetime":"2017-01-17 11:00"},{"value":"CLEAR_DAY","datetime":"2017-01-17 12:00"},{"value":"CLEAR_DAY","datetime":"2017-01-17 13:00"},{"value":"CLEAR_DAY","datetime":"2017-01-17 14:00"},{"value":"CLEAR_DAY","datetime":"2017-01-17 15:00"},{"value":"CLEAR_DAY","datetime":"2017-01-17 16:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 17:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 18:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 19:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 20:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 21:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 22:00"}],"cloudrate":[{"value":0.81,"datetime":"2017-01-15 23:00"},{"value":0.87,"datetime":"2017-01-16 00:00"},{"value":0.84,"datetime":"2017-01-16 01:00"},{"value":0.8,"datetime":"2017-01-16 02:00"},{"value":0.81,"datetime":"2017-01-16 03:00"},{"value":0.87,"datetime":"2017-01-16 04:00"},{"value":0.94,"datetime":"2017-01-16 05:00"},{"value":1,"datetime":"2017-01-16 06:00"},{"value":1,"datetime":"2017-01-16 07:00"},{"value":0.91,"datetime":"2017-01-16 08:00"},{"value":0.63,"datetime":"2017-01-16 09:00"},{"value":0.29,"datetime":"2017-01-16 10:00"},{"value":0.03,"datetime":"2017-01-16 11:00"},{"value":0,"datetime":"2017-01-16 12:00"},{"value":0,"datetime":"2017-01-16 13:00"},{"value":0.02,"datetime":"2017-01-16 14:00"},{"value":0.04,"datetime":"2017-01-16 15:00"},{"value":0.02,"datetime":"2017-01-16 16:00"},{"value":0,"datetime":"2017-01-16 17:00"},{"value":0,"datetime":"2017-01-16 18:00"},{"value":0,"datetime":"2017-01-16 19:00"},{"value":0,"datetime":"2017-01-16 20:00"},{"value":0,"datetime":"2017-01-16 21:00"},{"value":0,"datetime":"2017-01-16 22:00"},{"value":0,"datetime":"2017-01-16 23:00"},{"value":0,"datetime":"2017-01-17 00:00"},{"value":0,"datetime":"2017-01-17 01:00"},{"value":0,"datetime":"2017-01-17 02:00"},{"value":0,"datetime":"2017-01-17 03:00"},{"value":0,"datetime":"2017-01-17 04:00"},{"value":0,"datetime":"2017-01-17 05:00"},{"value":0,"datetime":"2017-01-17 06:00"},{"value":0,"datetime":"2017-01-17 07:00"},{"value":0,"datetime":"2017-01-17 08:00"},{"value":0,"datetime":"2017-01-17 09:00"},{"value":0,"datetime":"2017-01-17 10:00"},{"value":0,"datetime":"2017-01-17 11:00"},{"value":0,"datetime":"2017-01-17 12:00"},{"value":0,"datetime":"2017-01-17 13:00"},{"value":0,"datetime":"2017-01-17 14:00"},{"value":0,"datetime":"2017-01-17 15:00"},{"value":0,"datetime":"2017-01-17 16:00"},{"value":0,"datetime":"2017-01-17 17:00"},{"value":0,"datetime":"2017-01-17 18:00"},{"value":0,"datetime":"2017-01-17 19:00"},{"value":0,"datetime":"2017-01-17 20:00"},{"value":0,"datetime":"2017-01-17 21:00"},{"value":0,"datetime":"2017-01-17 22:00"}],"aqi":[{"value":115,"datetime":"2017-01-15 23:00"},{"value":119,"datetime":"2017-01-16 00:00"},{"value":123,"datetime":"2017-01-16 01:00"},{"value":125,"datetime":"2017-01-16 02:00"},{"value":129,"datetime":"2017-01-16 03:00"},{"value":133,"datetime":"2017-01-16 04:00"},{"value":135,"datetime":"2017-01-16 05:00"},{"value":139,"datetime":"2017-01-16 06:00"},{"value":143,"datetime":"2017-01-16 07:00"},{"value":145,"datetime":"2017-01-16 08:00"},{"value":149,"datetime":"2017-01-16 09:00"},{"value":152,"datetime":"2017-01-16 10:00"},{"value":155,"datetime":"2017-01-16 11:00"},{"value":159,"datetime":"2017-01-16 12:00"},{"value":162,"datetime":"2017-01-16 13:00"},{"value":166,"datetime":"2017-01-16 14:00"},{"value":169,"datetime":"2017-01-16 15:00"},{"value":172,"datetime":"2017-01-16 16:00"},{"value":175,"datetime":"2017-01-16 17:00"},{"value":179,"datetime":"2017-01-16 18:00"},{"value":182,"datetime":"2017-01-16 19:00"},{"value":185,"datetime":"2017-01-16 20:00"},{"value":187,"datetime":"2017-01-16 21:00"},{"value":190,"datetime":"2017-01-16 22:00"},{"value":193,"datetime":"2017-01-16 23:00"},{"value":196,"datetime":"2017-01-17 00:00"},{"value":199,"datetime":"2017-01-17 01:00"},{"value":203,"datetime":"2017-01-17 02:00"},{"value":205,"datetime":"2017-01-17 03:00"},{"value":207,"datetime":"2017-01-17 04:00"},{"value":209,"datetime":"2017-01-17 05:00"},{"value":209,"datetime":"2017-01-17 06:00"},{"value":210,"datetime":"2017-01-17 07:00"},{"value":215,"datetime":"2017-01-17 08:00"},{"value":222,"datetime":"2017-01-17 09:00"},{"value":227,"datetime":"2017-01-17 10:00"},{"value":220,"datetime":"2017-01-17 11:00"},{"value":194,"datetime":"2017-01-17 12:00"},{"value":152,"datetime":"2017-01-17 13:00"},{"value":123,"datetime":"2017-01-17 14:00"},{"value":113,"datetime":"2017-01-17 15:00"},{"value":117,"datetime":"2017-01-17 16:00"},{"value":125,"datetime":"2017-01-17 17:00"},{"value":130,"datetime":"2017-01-17 18:00"},{"value":133,"datetime":"2017-01-17 19:00"},{"value":134,"datetime":"2017-01-17 20:00"},{"value":136,"datetime":"2017-01-17 21:00"},{"value":139,"datetime":"2017-01-17 22:00"}],"humidity":[{"value":0.86,"datetime":"2017-01-15 23:00"},{"value":0.86,"datetime":"2017-01-16 00:00"},{"value":0.87,"datetime":"2017-01-16 01:00"},{"value":0.86,"datetime":"2017-01-16 02:00"},{"value":0.85,"datetime":"2017-01-16 03:00"},{"value":0.85,"datetime":"2017-01-16 04:00"},{"value":0.86,"datetime":"2017-01-16 05:00"},{"value":0.88,"datetime":"2017-01-16 06:00"},{"value":0.89,"datetime":"2017-01-16 07:00"},{"value":0.86,"datetime":"2017-01-16 08:00"},{"value":0.76,"datetime":"2017-01-16 09:00"},{"value":0.63,"datetime":"2017-01-16 10:00"},{"value":0.51,"datetime":"2017-01-16 11:00"},{"value":0.44,"datetime":"2017-01-16 12:00"},{"value":0.43,"datetime":"2017-01-16 13:00"},{"value":0.47,"datetime":"2017-01-16 14:00"},{"value":0.54,"datetime":"2017-01-16 15:00"},{"value":0.63,"datetime":"2017-01-16 16:00"},{"value":0.72,"datetime":"2017-01-16 17:00"},{"value":0.78,"datetime":"2017-01-16 18:00"},{"value":0.82,"datetime":"2017-01-16 19:00"},{"value":0.84,"datetime":"2017-01-16 20:00"},{"value":0.84,"datetime":"2017-01-16 21:00"},{"value":0.85,"datetime":"2017-01-16 22:00"},{"value":0.85,"datetime":"2017-01-16 23:00"},{"value":0.85,"datetime":"2017-01-17 00:00"},{"value":0.86,"datetime":"2017-01-17 01:00"},{"value":0.87,"datetime":"2017-01-17 02:00"},{"value":0.87,"datetime":"2017-01-17 03:00"},{"value":0.87,"datetime":"2017-01-17 04:00"},{"value":0.89,"datetime":"2017-01-17 05:00"},{"value":0.91,"datetime":"2017-01-17 06:00"},{"value":0.92,"datetime":"2017-01-17 07:00"},{"value":0.9,"datetime":"2017-01-17 08:00"},{"value":0.82,"datetime":"2017-01-17 09:00"},{"value":0.69,"datetime":"2017-01-17 10:00"},{"value":0.55,"datetime":"2017-01-17 11:00"},{"value":0.4,"datetime":"2017-01-17 12:00"},{"value":0.28,"datetime":"2017-01-17 13:00"},{"value":0.21,"datetime":"2017-01-17 14:00"},{"value":0.2,"datetime":"2017-01-17 15:00"},{"value":0.24,"datetime":"2017-01-17 16:00"},{"value":0.3,"datetime":"2017-01-17 17:00"},{"value":0.35,"datetime":"2017-01-17 18:00"},{"value":0.38,"datetime":"2017-01-17 19:00"},{"value":0.4,"datetime":"2017-01-17 20:00"},{"value":0.42,"datetime":"2017-01-17 21:00"},{"value":0.43,"datetime":"2017-01-17 22:00"}],"pm25":[{"value":87,"datetime":"2017-01-15 23:00"},{"value":90,"datetime":"2017-01-16 00:00"},{"value":93,"datetime":"2017-01-16 01:00"},{"value":95,"datetime":"2017-01-16 02:00"},{"value":98,"datetime":"2017-01-16 03:00"},{"value":101,"datetime":"2017-01-16 04:00"},{"value":103,"datetime":"2017-01-16 05:00"},{"value":106,"datetime":"2017-01-16 06:00"},{"value":109,"datetime":"2017-01-16 07:00"},{"value":111,"datetime":"2017-01-16 08:00"},{"value":114,"datetime":"2017-01-16 09:00"},{"value":116,"datetime":"2017-01-16 10:00"},{"value":118,"datetime":"2017-01-16 11:00"},{"value":121,"datetime":"2017-01-16 12:00"},{"value":123,"datetime":"2017-01-16 13:00"},{"value":126,"datetime":"2017-01-16 14:00"},{"value":128,"datetime":"2017-01-16 15:00"},{"value":130,"datetime":"2017-01-16 16:00"},{"value":132,"datetime":"2017-01-16 17:00"},{"value":135,"datetime":"2017-01-16 18:00"},{"value":137,"datetime":"2017-01-16 19:00"},{"value":139,"datetime":"2017-01-16 20:00"},{"value":141,"datetime":"2017-01-16 21:00"},{"value":143,"datetime":"2017-01-16 22:00"},{"value":145,"datetime":"2017-01-16 23:00"},{"value":147,"datetime":"2017-01-17 00:00"},{"value":149,"datetime":"2017-01-17 01:00"},{"value":152,"datetime":"2017-01-17 02:00"},{"value":154,"datetime":"2017-01-17 03:00"},{"value":156,"datetime":"2017-01-17 04:00"},{"value":158,"datetime":"2017-01-17 05:00"},{"value":158,"datetime":"2017-01-17 06:00"},{"value":159,"datetime":"2017-01-17 07:00"},{"value":164,"datetime":"2017-01-17 08:00"},{"value":171,"datetime":"2017-01-17 09:00"},{"value":176,"datetime":"2017-01-17 10:00"},{"value":169,"datetime":"2017-01-17 11:00"},{"value":146,"datetime":"2017-01-17 12:00"},{"value":116,"datetime":"2017-01-17 13:00"},{"value":93,"datetime":"2017-01-17 14:00"},{"value":85,"datetime":"2017-01-17 15:00"},{"value":88,"datetime":"2017-01-17 16:00"},{"value":95,"datetime":"2017-01-17 17:00"},{"value":99,"datetime":"2017-01-17 18:00"},{"value":101,"datetime":"2017-01-17 19:00"},{"value":102,"datetime":"2017-01-17 20:00"},{"value":104,"datetime":"2017-01-17 21:00"},{"value":106,"datetime":"2017-01-17 22:00"}],"precipitation":[{"value":0,"datetime":"2017-01-15 23:00"},{"value":0,"datetime":"2017-01-16 00:00"},{"value":0,"datetime":"2017-01-16 01:00"},{"value":0,"datetime":"2017-01-16 02:00"},{"value":0,"datetime":"2017-01-16 03:00"},{"value":0,"datetime":"2017-01-16 04:00"},{"value":0,"datetime":"2017-01-16 05:00"},{"value":0,"datetime":"2017-01-16 06:00"},{"value":0,"datetime":"2017-01-16 07:00"},{"value":0,"datetime":"2017-01-16 08:00"},{"value":0,"datetime":"2017-01-16 09:00"},{"value":0,"datetime":"2017-01-16 10:00"},{"value":0,"datetime":"2017-01-16 11:00"},{"value":0,"datetime":"2017-01-16 12:00"},{"value":0,"datetime":"2017-01-16 13:00"},{"value":0,"datetime":"2017-01-16 14:00"},{"value":0,"datetime":"2017-01-16 15:00"},{"value":0,"datetime":"2017-01-16 16:00"},{"value":0,"datetime":"2017-01-16 17:00"},{"value":0,"datetime":"2017-01-16 18:00"},{"value":0,"datetime":"2017-01-16 19:00"},{"value":0,"datetime":"2017-01-16 20:00"},{"value":0,"datetime":"2017-01-16 21:00"},{"value":0,"datetime":"2017-01-16 22:00"},{"value":0,"datetime":"2017-01-16 23:00"},{"value":0,"datetime":"2017-01-17 00:00"},{"value":0,"datetime":"2017-01-17 01:00"},{"value":0,"datetime":"2017-01-17 02:00"},{"value":0,"datetime":"2017-01-17 03:00"},{"value":0,"datetime":"2017-01-17 04:00"},{"value":0,"datetime":"2017-01-17 05:00"},{"value":0,"datetime":"2017-01-17 06:00"},{"value":0,"datetime":"2017-01-17 07:00"},{"value":0,"datetime":"2017-01-17 08:00"},{"value":0,"datetime":"2017-01-17 09:00"},{"value":0,"datetime":"2017-01-17 10:00"},{"value":0,"datetime":"2017-01-17 11:00"},{"value":0,"datetime":"2017-01-17 12:00"},{"value":0,"datetime":"2017-01-17 13:00"},{"value":0,"datetime":"2017-01-17 14:00"},{"value":0,"datetime":"2017-01-17 15:00"},{"value":0,"datetime":"2017-01-17 16:00"},{"value":0,"datetime":"2017-01-17 17:00"},{"value":0,"datetime":"2017-01-17 18:00"},{"value":0,"datetime":"2017-01-17 19:00"},{"value":0,"datetime":"2017-01-17 20:00"},{"value":0,"datetime":"2017-01-17 21:00"},{"value":0,"datetime":"2017-01-17 22:00"}],"wind":[{"direction":19.98,"speed":3.55,"datetime":"2017-01-15 23:00"},{"direction":21.98,"speed":3.28,"datetime":"2017-01-16 00:00"},{"direction":25.6,"speed":3.03,"datetime":"2017-01-16 01:00"},{"direction":27.36,"speed":2.84,"datetime":"2017-01-16 02:00"},{"direction":23.84,"speed":2.73,"datetime":"2017-01-16 03:00"},{"direction":16.17,"speed":2.74,"datetime":"2017-01-16 04:00"},{"direction":7.6,"speed":2.88,"datetime":"2017-01-16 05:00"},{"direction":1.13,"speed":3.09,"datetime":"2017-01-16 06:00"},{"direction":358.05,"speed":3.08,"datetime":"2017-01-16 07:00"},{"direction":359.45,"speed":2.53,"datetime":"2017-01-16 08:00"},{"direction":15.55,"speed":1.3,"datetime":"2017-01-16 09:00"},{"direction":125.66,"speed":1.08,"datetime":"2017-01-16 10:00"},{"direction":154.52,"speed":3.21,"datetime":"2017-01-16 11:00"},{"direction":162.07,"speed":5.53,"datetime":"2017-01-16 12:00"},{"direction":165.87,"speed":7.41,"datetime":"2017-01-16 13:00"},{"direction":168.15,"speed":8.24,"datetime":"2017-01-16 14:00"},{"direction":169.58,"speed":7.62,"datetime":"2017-01-16 15:00"},{"direction":170.13,"speed":5.85,"datetime":"2017-01-16 16:00"},{"direction":167.67,"speed":3.47,"datetime":"2017-01-16 17:00"},{"direction":139.95,"speed":1.11,"datetime":"2017-01-16 18:00"},{"direction":32.43,"speed":1.61,"datetime":"2017-01-16 19:00"},{"direction":21.41,"speed":2.95,"datetime":"2017-01-16 20:00"},{"direction":22.82,"speed":3.26,"datetime":"2017-01-16 21:00"},{"direction":28.95,"speed":2.84,"datetime":"2017-01-16 22:00"},{"direction":38.61,"speed":2.2,"datetime":"2017-01-16 23:00"},{"direction":47.82,"speed":1.68,"datetime":"2017-01-17 00:00"},{"direction":56.46,"speed":1.25,"datetime":"2017-01-17 01:00"},{"direction":71.16,"speed":0.89,"datetime":"2017-01-17 02:00"},{"direction":102.07,"speed":0.7,"datetime":"2017-01-17 03:00"},{"direction":134.36,"speed":0.62,"datetime":"2017-01-17 04:00"},{"direction":187.47,"speed":0.33,"datetime":"2017-01-17 05:00"},{"direction":288.04,"speed":0.88,"datetime":"2017-01-17 06:00"},{"direction":299.33,"speed":1.9,"datetime":"2017-01-17 07:00"},{"direction":296.84,"speed":2.36,"datetime":"2017-01-17 08:00"},{"direction":280.63,"speed":2.13,"datetime":"2017-01-17 09:00"},{"direction":263.21,"speed":2.53,"datetime":"2017-01-17 10:00"},{"direction":270.88,"speed":4.55,"datetime":"2017-01-17 11:00"},{"direction":283.86,"speed":9.04,"datetime":"2017-01-17 12:00"},{"direction":290.61,"speed":14.33,"datetime":"2017-01-17 13:00"},{"direction":294.59,"speed":17.67,"datetime":"2017-01-17 14:00"},{"direction":298.3,"speed":17.13,"datetime":"2017-01-17 15:00"},{"direction":303.98,"speed":14.22,"datetime":"2017-01-17 16:00"},{"direction":313.4,"speed":11.36,"datetime":"2017-01-17 17:00"},{"direction":324.03,"speed":10.38,"datetime":"2017-01-17 18:00"},{"direction":330.89,"speed":10.72,"datetime":"2017-01-17 19:00"},{"direction":333.26,"speed":11.28,"datetime":"2017-01-17 20:00"},{"direction":332.74,"speed":11.33,"datetime":"2017-01-17 21:00"},{"direction":331.16,"speed":10.99,"datetime":"2017-01-17 22:00"}],"temperature":[{"value":-4,"datetime":"2017-01-15 23:00"},{"value":-5.01,"datetime":"2017-01-16 00:00"},{"value":-5.94,"datetime":"2017-01-16 01:00"},{"value":-6.72,"datetime":"2017-01-16 02:00"},{"value":-7.31,"datetime":"2017-01-16 03:00"},{"value":-7.91,"datetime":"2017-01-16 04:00"},{"value":-8.79,"datetime":"2017-01-16 05:00"},{"value":-9.27,"datetime":"2017-01-16 06:00"},{"value":-9.6,"datetime":"2017-01-16 07:00"},{"value":-9.12,"datetime":"2017-01-16 08:00"},{"value":-7.39,"datetime":"2017-01-16 09:00"},{"value":-4.95,"datetime":"2017-01-16 10:00"},{"value":-2.61,"datetime":"2017-01-16 11:00"},{"value":-1.04,"datetime":"2017-01-16 12:00"},{"value":-0.44,"datetime":"2017-01-16 13:00"},{"value":-0.89,"datetime":"2017-01-16 14:00"},{"value":-2.33,"datetime":"2017-01-16 15:00"},{"value":-4.21,"datetime":"2017-01-16 16:00"},{"value":-5.84,"datetime":"2017-01-16 17:00"},{"value":-6.74,"datetime":"2017-01-16 18:00"},{"value":-7.06,"datetime":"2017-01-16 19:00"},{"value":-7.19,"datetime":"2017-01-16 20:00"},{"value":-7.4,"datetime":"2017-01-16 21:00"},{"value":-7.7,"datetime":"2017-01-16 22:00"},{"value":-8.03,"datetime":"2017-01-16 23:00"},{"value":-8.34,"datetime":"2017-01-17 00:00"},{"value":-8.61,"datetime":"2017-01-17 01:00"},{"value":-8.81,"datetime":"2017-01-17 02:00"},{"value":-8.97,"datetime":"2017-01-17 03:00"},{"value":-9.17,"datetime":"2017-01-17 04:00"},{"value":-9.52,"datetime":"2017-01-17 05:00"},{"value":-10.02,"datetime":"2017-01-17 06:00"},{"value":-10.19,"datetime":"2017-01-17 07:00"},{"value":-9.42,"datetime":"2017-01-17 08:00"},{"value":-7.36,"datetime":"2017-01-17 09:00"},{"value":-4.52,"datetime":"2017-01-17 10:00"},{"value":-1.65,"datetime":"2017-01-17 11:00"},{"value":0.58,"datetime":"2017-01-17 12:00"},{"value":1.85,"datetime":"2017-01-17 13:00"},{"value":1.95,"datetime":"2017-01-17 14:00"},{"value":0.78,"datetime":"2017-01-17 15:00"},{"value":-1.07,"datetime":"2017-01-17 16:00"},{"value":-2.92,"datetime":"2017-01-17 17:00"},{"value":-4.18,"datetime":"2017-01-17 18:00"},{"value":-4.94,"datetime":"2017-01-17 19:00"},{"value":-5.4,"datetime":"2017-01-17 20:00"},{"value":-5.75,"datetime":"2017-01-17 21:00"},{"value":-6.07,"datetime":"2017-01-17 22:00"}]},"minutely":{"status":"ok","description":"雷达数据还在收集中\u2026\u2026但小彩云觉得不会下雪呢","probability":[0,0,0,0],"datasource":"gfs","precipitation_2h":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"precipitation":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]},"daily":{"status":"ok","coldRisk":[{"index":"4","desc":"极易发","datetime":"2017-01-15"},{"index":"4","desc":"极易发","datetime":"2017-01-16"},{"index":"4","desc":"极易发","datetime":"2017-01-17"},{"index":"4","desc":"极易发","datetime":"2017-01-18"},{"index":"4","desc":"极易发","datetime":"2017-01-19"}],"temperature":[{"date":"2017-01-15","max":-2.5,"avg":-4,"min":-10.03},{"date":"2017-01-16","max":-0.44,"avg":-5.98,"min":-9.6},{"date":"2017-01-17","max":1.95,"avg":-5.34,"min":-10.19},{"date":"2017-01-18","max":-0.44,"avg":-5.53,"min":-8.88},{"date":"2017-01-19","max":-2.49,"avg":-6.48,"min":-10.42}],"skycon":[{"date":"2017-01-15","value":"CLOUDY"},{"date":"2017-01-16","value":"PARTLY_CLOUDY_DAY"},{"date":"2017-01-17","value":"CLEAR_DAY"},{"date":"2017-01-18","value":"PARTLY_CLOUDY_DAY"},{"date":"2017-01-19","value":"PARTLY_CLOUDY_DAY"}],"cloudrate":[{"date":"2017-01-15","max":1,"avg":0.81,"min":0.06},{"date":"2017-01-16","max":1,"avg":0.38,"min":0},{"date":"2017-01-17","max":0,"avg":0,"min":0},{"date":"2017-01-18","max":0.99,"avg":0.23,"min":0},{"date":"2017-01-19","max":1,"avg":0.53,"min":0}],"aqi":[{"date":"2017-01-15","max":123,"avg":115,"min":55},{"date":"2017-01-16","max":193,"avg":156.92,"min":119},{"date":"2017-01-17","max":227,"avg":173.38,"min":113},{"date":"2017-01-18","max":194,"avg":163.83,"min":146},{"date":"2017-01-19","max":227,"avg":96.54,"min":7}],"humidity":[{"date":"2017-01-15","max":0.93,"avg":0.86,"min":0.47},{"date":"2017-01-16","max":0.89,"avg":0.75,"min":0.43},{"date":"2017-01-17","max":0.92,"avg":0.58,"min":0.2},{"date":"2017-01-18","max":0.48,"avg":0.4,"min":0.22},{"date":"2017-01-19","max":0.57,"avg":0.37,"min":0.18}],"astro":[{"date":"2017-01-15","sunset":{"time":"17:11"},"sunrise":{"time":"07:34"}},{"date":"2017-01-16","sunset":{"time":"17:12"},"sunrise":{"time":"07:33"}},{"date":"2017-01-17","sunset":{"time":"17:13"},"sunrise":{"time":"07:33"}},{"date":"2017-01-18","sunset":{"time":"17:14"},"sunrise":{"time":"07:32"}},{"date":"2017-01-19","sunset":{"time":"17:16"},"sunrise":{"time":"07:32"}}],"ultraviolet":[{"index":"1","desc":"最弱","datetime":"2017-01-15"},{"index":"4","desc":"强","datetime":"2017-01-16"},{"index":"4","desc":"强","datetime":"2017-01-17"},{"index":"4","desc":"强","datetime":"2017-01-18"},{"index":"3","desc":"中等","datetime":"2017-01-19"}],"pm25":[{"date":"2017-01-15","max":93,"avg":87,"min":36},{"date":"2017-01-16","max":145,"avg":118.92,"min":90},{"date":"2017-01-17","max":176,"avg":131.54,"min":85},{"date":"2017-01-18","max":146,"avg":124.38,"min":112},{"date":"2017-01-19","max":176,"avg":71.71,"min":3}],"dressing":[{"index":"8","desc":"极冷","datetime":"2017-01-15"},{"index":"8","desc":"极冷","datetime":"2017-01-16"},{"index":"8","desc":"极冷","datetime":"2017-01-17"},{"index":"8","desc":"极冷","datetime":"2017-01-18"},{"index":"8","desc":"极冷","datetime":"2017-01-19"}],"carWashing":[{"index":"2","desc":"较适宜","datetime":"2017-01-15"},{"index":"2","desc":"较适宜","datetime":"2017-01-16"},{"index":"2","desc":"较适宜","datetime":"2017-01-17"},{"index":"2","desc":"较适宜","datetime":"2017-01-18"},{"index":"2","desc":"较适宜","datetime":"2017-01-19"}],"precipitation":[{"date":"2017-01-15","max":0,"avg":0,"min":0},{"date":"2017-01-16","max":0,"avg":0,"min":0},{"date":"2017-01-17","max":0,"avg":0,"min":0},{"date":"2017-01-18","max":0,"avg":0,"min":0},{"date":"2017-01-19","max":0,"avg":0,"min":0}],"wind":[{"date":"2017-01-15","max":{"direction":184.91,"speed":8.45},"avg":{"direction":147.71,"speed":4.59},"min":{"direction":111.16,"speed":2.52}},{"date":"2017-01-16","max":{"direction":168.15,"speed":8.24},"avg":{"direction":99.51,"speed":3.49},"min":{"direction":125.66,"speed":1.08}},{"date":"2017-01-17","max":{"direction":294.59,"speed":17.67},"avg":{"direction":310.67,"speed":7.04},"min":{"direction":187.47,"speed":0.33}},{"date":"2017-01-18","max":{"direction":347.92,"speed":10.63},"avg":{"direction":345.7,"speed":7.22},"min":{"direction":153.81,"speed":0.83}},{"date":"2017-01-19","max":{"direction":332.25,"speed":23.09},"avg":{"direction":330.81,"speed":12.29},"min":{"direction":42.19,"speed":1.68}}]},"primary":0}
     * server_time : 1484495553
     * api_status : active
     * tzshift : 28800
     * api_version : v2.2
     * unit : metric
     * location : [40.32,116.63]
     */

    private String status;
    private String lang;
    private ResultBean result;
    private int server_time;
    private String api_status;
    private int tzshift;
    private String api_version;
    private String unit;
    private List<Double> location;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getServer_time() {
        return server_time;
    }

    public void setServer_time(int server_time) {
        this.server_time = server_time;
    }

    public String getApi_status() {
        return api_status;
    }

    public void setApi_status(String api_status) {
        this.api_status = api_status;
    }

    public int getTzshift() {
        return tzshift;
    }

    public void setTzshift(int tzshift) {
        this.tzshift = tzshift;
    }

    public String getApi_version() {
        return api_version;
    }

    public void setApi_version(String api_version) {
        this.api_version = api_version;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public static class ResultBean {
        /**
         * hourly : {"status":"ok","description":"多云，明天下午16点钟后转晴","skycon":[{"value":"CLOUDY","datetime":"2017-01-15 23:00"},{"value":"CLOUDY","datetime":"2017-01-16 00:00"},{"value":"CLOUDY","datetime":"2017-01-16 01:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2017-01-16 02:00"},{"value":"CLOUDY","datetime":"2017-01-16 03:00"},{"value":"CLOUDY","datetime":"2017-01-16 04:00"},{"value":"CLOUDY","datetime":"2017-01-16 05:00"},{"value":"CLOUDY","datetime":"2017-01-16 06:00"},{"value":"CLOUDY","datetime":"2017-01-16 07:00"},{"value":"CLOUDY","datetime":"2017-01-16 08:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2017-01-16 09:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2017-01-16 10:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 11:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 12:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 13:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 14:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 15:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 16:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 17:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 18:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 19:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 20:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 21:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 22:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 23:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 00:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 01:00"},{"value":"HAZE","datetime":"2017-01-17 02:00"},{"value":"HAZE","datetime":"2017-01-17 03:00"},{"value":"HAZE","datetime":"2017-01-17 04:00"},{"value":"HAZE","datetime":"2017-01-17 05:00"},{"value":"HAZE","datetime":"2017-01-17 06:00"},{"value":"HAZE","datetime":"2017-01-17 07:00"},{"value":"HAZE","datetime":"2017-01-17 08:00"},{"value":"HAZE","datetime":"2017-01-17 09:00"},{"value":"HAZE","datetime":"2017-01-17 10:00"},{"value":"HAZE","datetime":"2017-01-17 11:00"},{"value":"CLEAR_DAY","datetime":"2017-01-17 12:00"},{"value":"CLEAR_DAY","datetime":"2017-01-17 13:00"},{"value":"CLEAR_DAY","datetime":"2017-01-17 14:00"},{"value":"CLEAR_DAY","datetime":"2017-01-17 15:00"},{"value":"CLEAR_DAY","datetime":"2017-01-17 16:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 17:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 18:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 19:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 20:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 21:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 22:00"}],"cloudrate":[{"value":0.81,"datetime":"2017-01-15 23:00"},{"value":0.87,"datetime":"2017-01-16 00:00"},{"value":0.84,"datetime":"2017-01-16 01:00"},{"value":0.8,"datetime":"2017-01-16 02:00"},{"value":0.81,"datetime":"2017-01-16 03:00"},{"value":0.87,"datetime":"2017-01-16 04:00"},{"value":0.94,"datetime":"2017-01-16 05:00"},{"value":1,"datetime":"2017-01-16 06:00"},{"value":1,"datetime":"2017-01-16 07:00"},{"value":0.91,"datetime":"2017-01-16 08:00"},{"value":0.63,"datetime":"2017-01-16 09:00"},{"value":0.29,"datetime":"2017-01-16 10:00"},{"value":0.03,"datetime":"2017-01-16 11:00"},{"value":0,"datetime":"2017-01-16 12:00"},{"value":0,"datetime":"2017-01-16 13:00"},{"value":0.02,"datetime":"2017-01-16 14:00"},{"value":0.04,"datetime":"2017-01-16 15:00"},{"value":0.02,"datetime":"2017-01-16 16:00"},{"value":0,"datetime":"2017-01-16 17:00"},{"value":0,"datetime":"2017-01-16 18:00"},{"value":0,"datetime":"2017-01-16 19:00"},{"value":0,"datetime":"2017-01-16 20:00"},{"value":0,"datetime":"2017-01-16 21:00"},{"value":0,"datetime":"2017-01-16 22:00"},{"value":0,"datetime":"2017-01-16 23:00"},{"value":0,"datetime":"2017-01-17 00:00"},{"value":0,"datetime":"2017-01-17 01:00"},{"value":0,"datetime":"2017-01-17 02:00"},{"value":0,"datetime":"2017-01-17 03:00"},{"value":0,"datetime":"2017-01-17 04:00"},{"value":0,"datetime":"2017-01-17 05:00"},{"value":0,"datetime":"2017-01-17 06:00"},{"value":0,"datetime":"2017-01-17 07:00"},{"value":0,"datetime":"2017-01-17 08:00"},{"value":0,"datetime":"2017-01-17 09:00"},{"value":0,"datetime":"2017-01-17 10:00"},{"value":0,"datetime":"2017-01-17 11:00"},{"value":0,"datetime":"2017-01-17 12:00"},{"value":0,"datetime":"2017-01-17 13:00"},{"value":0,"datetime":"2017-01-17 14:00"},{"value":0,"datetime":"2017-01-17 15:00"},{"value":0,"datetime":"2017-01-17 16:00"},{"value":0,"datetime":"2017-01-17 17:00"},{"value":0,"datetime":"2017-01-17 18:00"},{"value":0,"datetime":"2017-01-17 19:00"},{"value":0,"datetime":"2017-01-17 20:00"},{"value":0,"datetime":"2017-01-17 21:00"},{"value":0,"datetime":"2017-01-17 22:00"}],"aqi":[{"value":115,"datetime":"2017-01-15 23:00"},{"value":119,"datetime":"2017-01-16 00:00"},{"value":123,"datetime":"2017-01-16 01:00"},{"value":125,"datetime":"2017-01-16 02:00"},{"value":129,"datetime":"2017-01-16 03:00"},{"value":133,"datetime":"2017-01-16 04:00"},{"value":135,"datetime":"2017-01-16 05:00"},{"value":139,"datetime":"2017-01-16 06:00"},{"value":143,"datetime":"2017-01-16 07:00"},{"value":145,"datetime":"2017-01-16 08:00"},{"value":149,"datetime":"2017-01-16 09:00"},{"value":152,"datetime":"2017-01-16 10:00"},{"value":155,"datetime":"2017-01-16 11:00"},{"value":159,"datetime":"2017-01-16 12:00"},{"value":162,"datetime":"2017-01-16 13:00"},{"value":166,"datetime":"2017-01-16 14:00"},{"value":169,"datetime":"2017-01-16 15:00"},{"value":172,"datetime":"2017-01-16 16:00"},{"value":175,"datetime":"2017-01-16 17:00"},{"value":179,"datetime":"2017-01-16 18:00"},{"value":182,"datetime":"2017-01-16 19:00"},{"value":185,"datetime":"2017-01-16 20:00"},{"value":187,"datetime":"2017-01-16 21:00"},{"value":190,"datetime":"2017-01-16 22:00"},{"value":193,"datetime":"2017-01-16 23:00"},{"value":196,"datetime":"2017-01-17 00:00"},{"value":199,"datetime":"2017-01-17 01:00"},{"value":203,"datetime":"2017-01-17 02:00"},{"value":205,"datetime":"2017-01-17 03:00"},{"value":207,"datetime":"2017-01-17 04:00"},{"value":209,"datetime":"2017-01-17 05:00"},{"value":209,"datetime":"2017-01-17 06:00"},{"value":210,"datetime":"2017-01-17 07:00"},{"value":215,"datetime":"2017-01-17 08:00"},{"value":222,"datetime":"2017-01-17 09:00"},{"value":227,"datetime":"2017-01-17 10:00"},{"value":220,"datetime":"2017-01-17 11:00"},{"value":194,"datetime":"2017-01-17 12:00"},{"value":152,"datetime":"2017-01-17 13:00"},{"value":123,"datetime":"2017-01-17 14:00"},{"value":113,"datetime":"2017-01-17 15:00"},{"value":117,"datetime":"2017-01-17 16:00"},{"value":125,"datetime":"2017-01-17 17:00"},{"value":130,"datetime":"2017-01-17 18:00"},{"value":133,"datetime":"2017-01-17 19:00"},{"value":134,"datetime":"2017-01-17 20:00"},{"value":136,"datetime":"2017-01-17 21:00"},{"value":139,"datetime":"2017-01-17 22:00"}],"humidity":[{"value":0.86,"datetime":"2017-01-15 23:00"},{"value":0.86,"datetime":"2017-01-16 00:00"},{"value":0.87,"datetime":"2017-01-16 01:00"},{"value":0.86,"datetime":"2017-01-16 02:00"},{"value":0.85,"datetime":"2017-01-16 03:00"},{"value":0.85,"datetime":"2017-01-16 04:00"},{"value":0.86,"datetime":"2017-01-16 05:00"},{"value":0.88,"datetime":"2017-01-16 06:00"},{"value":0.89,"datetime":"2017-01-16 07:00"},{"value":0.86,"datetime":"2017-01-16 08:00"},{"value":0.76,"datetime":"2017-01-16 09:00"},{"value":0.63,"datetime":"2017-01-16 10:00"},{"value":0.51,"datetime":"2017-01-16 11:00"},{"value":0.44,"datetime":"2017-01-16 12:00"},{"value":0.43,"datetime":"2017-01-16 13:00"},{"value":0.47,"datetime":"2017-01-16 14:00"},{"value":0.54,"datetime":"2017-01-16 15:00"},{"value":0.63,"datetime":"2017-01-16 16:00"},{"value":0.72,"datetime":"2017-01-16 17:00"},{"value":0.78,"datetime":"2017-01-16 18:00"},{"value":0.82,"datetime":"2017-01-16 19:00"},{"value":0.84,"datetime":"2017-01-16 20:00"},{"value":0.84,"datetime":"2017-01-16 21:00"},{"value":0.85,"datetime":"2017-01-16 22:00"},{"value":0.85,"datetime":"2017-01-16 23:00"},{"value":0.85,"datetime":"2017-01-17 00:00"},{"value":0.86,"datetime":"2017-01-17 01:00"},{"value":0.87,"datetime":"2017-01-17 02:00"},{"value":0.87,"datetime":"2017-01-17 03:00"},{"value":0.87,"datetime":"2017-01-17 04:00"},{"value":0.89,"datetime":"2017-01-17 05:00"},{"value":0.91,"datetime":"2017-01-17 06:00"},{"value":0.92,"datetime":"2017-01-17 07:00"},{"value":0.9,"datetime":"2017-01-17 08:00"},{"value":0.82,"datetime":"2017-01-17 09:00"},{"value":0.69,"datetime":"2017-01-17 10:00"},{"value":0.55,"datetime":"2017-01-17 11:00"},{"value":0.4,"datetime":"2017-01-17 12:00"},{"value":0.28,"datetime":"2017-01-17 13:00"},{"value":0.21,"datetime":"2017-01-17 14:00"},{"value":0.2,"datetime":"2017-01-17 15:00"},{"value":0.24,"datetime":"2017-01-17 16:00"},{"value":0.3,"datetime":"2017-01-17 17:00"},{"value":0.35,"datetime":"2017-01-17 18:00"},{"value":0.38,"datetime":"2017-01-17 19:00"},{"value":0.4,"datetime":"2017-01-17 20:00"},{"value":0.42,"datetime":"2017-01-17 21:00"},{"value":0.43,"datetime":"2017-01-17 22:00"}],"pm25":[{"value":87,"datetime":"2017-01-15 23:00"},{"value":90,"datetime":"2017-01-16 00:00"},{"value":93,"datetime":"2017-01-16 01:00"},{"value":95,"datetime":"2017-01-16 02:00"},{"value":98,"datetime":"2017-01-16 03:00"},{"value":101,"datetime":"2017-01-16 04:00"},{"value":103,"datetime":"2017-01-16 05:00"},{"value":106,"datetime":"2017-01-16 06:00"},{"value":109,"datetime":"2017-01-16 07:00"},{"value":111,"datetime":"2017-01-16 08:00"},{"value":114,"datetime":"2017-01-16 09:00"},{"value":116,"datetime":"2017-01-16 10:00"},{"value":118,"datetime":"2017-01-16 11:00"},{"value":121,"datetime":"2017-01-16 12:00"},{"value":123,"datetime":"2017-01-16 13:00"},{"value":126,"datetime":"2017-01-16 14:00"},{"value":128,"datetime":"2017-01-16 15:00"},{"value":130,"datetime":"2017-01-16 16:00"},{"value":132,"datetime":"2017-01-16 17:00"},{"value":135,"datetime":"2017-01-16 18:00"},{"value":137,"datetime":"2017-01-16 19:00"},{"value":139,"datetime":"2017-01-16 20:00"},{"value":141,"datetime":"2017-01-16 21:00"},{"value":143,"datetime":"2017-01-16 22:00"},{"value":145,"datetime":"2017-01-16 23:00"},{"value":147,"datetime":"2017-01-17 00:00"},{"value":149,"datetime":"2017-01-17 01:00"},{"value":152,"datetime":"2017-01-17 02:00"},{"value":154,"datetime":"2017-01-17 03:00"},{"value":156,"datetime":"2017-01-17 04:00"},{"value":158,"datetime":"2017-01-17 05:00"},{"value":158,"datetime":"2017-01-17 06:00"},{"value":159,"datetime":"2017-01-17 07:00"},{"value":164,"datetime":"2017-01-17 08:00"},{"value":171,"datetime":"2017-01-17 09:00"},{"value":176,"datetime":"2017-01-17 10:00"},{"value":169,"datetime":"2017-01-17 11:00"},{"value":146,"datetime":"2017-01-17 12:00"},{"value":116,"datetime":"2017-01-17 13:00"},{"value":93,"datetime":"2017-01-17 14:00"},{"value":85,"datetime":"2017-01-17 15:00"},{"value":88,"datetime":"2017-01-17 16:00"},{"value":95,"datetime":"2017-01-17 17:00"},{"value":99,"datetime":"2017-01-17 18:00"},{"value":101,"datetime":"2017-01-17 19:00"},{"value":102,"datetime":"2017-01-17 20:00"},{"value":104,"datetime":"2017-01-17 21:00"},{"value":106,"datetime":"2017-01-17 22:00"}],"precipitation":[{"value":0,"datetime":"2017-01-15 23:00"},{"value":0,"datetime":"2017-01-16 00:00"},{"value":0,"datetime":"2017-01-16 01:00"},{"value":0,"datetime":"2017-01-16 02:00"},{"value":0,"datetime":"2017-01-16 03:00"},{"value":0,"datetime":"2017-01-16 04:00"},{"value":0,"datetime":"2017-01-16 05:00"},{"value":0,"datetime":"2017-01-16 06:00"},{"value":0,"datetime":"2017-01-16 07:00"},{"value":0,"datetime":"2017-01-16 08:00"},{"value":0,"datetime":"2017-01-16 09:00"},{"value":0,"datetime":"2017-01-16 10:00"},{"value":0,"datetime":"2017-01-16 11:00"},{"value":0,"datetime":"2017-01-16 12:00"},{"value":0,"datetime":"2017-01-16 13:00"},{"value":0,"datetime":"2017-01-16 14:00"},{"value":0,"datetime":"2017-01-16 15:00"},{"value":0,"datetime":"2017-01-16 16:00"},{"value":0,"datetime":"2017-01-16 17:00"},{"value":0,"datetime":"2017-01-16 18:00"},{"value":0,"datetime":"2017-01-16 19:00"},{"value":0,"datetime":"2017-01-16 20:00"},{"value":0,"datetime":"2017-01-16 21:00"},{"value":0,"datetime":"2017-01-16 22:00"},{"value":0,"datetime":"2017-01-16 23:00"},{"value":0,"datetime":"2017-01-17 00:00"},{"value":0,"datetime":"2017-01-17 01:00"},{"value":0,"datetime":"2017-01-17 02:00"},{"value":0,"datetime":"2017-01-17 03:00"},{"value":0,"datetime":"2017-01-17 04:00"},{"value":0,"datetime":"2017-01-17 05:00"},{"value":0,"datetime":"2017-01-17 06:00"},{"value":0,"datetime":"2017-01-17 07:00"},{"value":0,"datetime":"2017-01-17 08:00"},{"value":0,"datetime":"2017-01-17 09:00"},{"value":0,"datetime":"2017-01-17 10:00"},{"value":0,"datetime":"2017-01-17 11:00"},{"value":0,"datetime":"2017-01-17 12:00"},{"value":0,"datetime":"2017-01-17 13:00"},{"value":0,"datetime":"2017-01-17 14:00"},{"value":0,"datetime":"2017-01-17 15:00"},{"value":0,"datetime":"2017-01-17 16:00"},{"value":0,"datetime":"2017-01-17 17:00"},{"value":0,"datetime":"2017-01-17 18:00"},{"value":0,"datetime":"2017-01-17 19:00"},{"value":0,"datetime":"2017-01-17 20:00"},{"value":0,"datetime":"2017-01-17 21:00"},{"value":0,"datetime":"2017-01-17 22:00"}],"wind":[{"direction":19.98,"speed":3.55,"datetime":"2017-01-15 23:00"},{"direction":21.98,"speed":3.28,"datetime":"2017-01-16 00:00"},{"direction":25.6,"speed":3.03,"datetime":"2017-01-16 01:00"},{"direction":27.36,"speed":2.84,"datetime":"2017-01-16 02:00"},{"direction":23.84,"speed":2.73,"datetime":"2017-01-16 03:00"},{"direction":16.17,"speed":2.74,"datetime":"2017-01-16 04:00"},{"direction":7.6,"speed":2.88,"datetime":"2017-01-16 05:00"},{"direction":1.13,"speed":3.09,"datetime":"2017-01-16 06:00"},{"direction":358.05,"speed":3.08,"datetime":"2017-01-16 07:00"},{"direction":359.45,"speed":2.53,"datetime":"2017-01-16 08:00"},{"direction":15.55,"speed":1.3,"datetime":"2017-01-16 09:00"},{"direction":125.66,"speed":1.08,"datetime":"2017-01-16 10:00"},{"direction":154.52,"speed":3.21,"datetime":"2017-01-16 11:00"},{"direction":162.07,"speed":5.53,"datetime":"2017-01-16 12:00"},{"direction":165.87,"speed":7.41,"datetime":"2017-01-16 13:00"},{"direction":168.15,"speed":8.24,"datetime":"2017-01-16 14:00"},{"direction":169.58,"speed":7.62,"datetime":"2017-01-16 15:00"},{"direction":170.13,"speed":5.85,"datetime":"2017-01-16 16:00"},{"direction":167.67,"speed":3.47,"datetime":"2017-01-16 17:00"},{"direction":139.95,"speed":1.11,"datetime":"2017-01-16 18:00"},{"direction":32.43,"speed":1.61,"datetime":"2017-01-16 19:00"},{"direction":21.41,"speed":2.95,"datetime":"2017-01-16 20:00"},{"direction":22.82,"speed":3.26,"datetime":"2017-01-16 21:00"},{"direction":28.95,"speed":2.84,"datetime":"2017-01-16 22:00"},{"direction":38.61,"speed":2.2,"datetime":"2017-01-16 23:00"},{"direction":47.82,"speed":1.68,"datetime":"2017-01-17 00:00"},{"direction":56.46,"speed":1.25,"datetime":"2017-01-17 01:00"},{"direction":71.16,"speed":0.89,"datetime":"2017-01-17 02:00"},{"direction":102.07,"speed":0.7,"datetime":"2017-01-17 03:00"},{"direction":134.36,"speed":0.62,"datetime":"2017-01-17 04:00"},{"direction":187.47,"speed":0.33,"datetime":"2017-01-17 05:00"},{"direction":288.04,"speed":0.88,"datetime":"2017-01-17 06:00"},{"direction":299.33,"speed":1.9,"datetime":"2017-01-17 07:00"},{"direction":296.84,"speed":2.36,"datetime":"2017-01-17 08:00"},{"direction":280.63,"speed":2.13,"datetime":"2017-01-17 09:00"},{"direction":263.21,"speed":2.53,"datetime":"2017-01-17 10:00"},{"direction":270.88,"speed":4.55,"datetime":"2017-01-17 11:00"},{"direction":283.86,"speed":9.04,"datetime":"2017-01-17 12:00"},{"direction":290.61,"speed":14.33,"datetime":"2017-01-17 13:00"},{"direction":294.59,"speed":17.67,"datetime":"2017-01-17 14:00"},{"direction":298.3,"speed":17.13,"datetime":"2017-01-17 15:00"},{"direction":303.98,"speed":14.22,"datetime":"2017-01-17 16:00"},{"direction":313.4,"speed":11.36,"datetime":"2017-01-17 17:00"},{"direction":324.03,"speed":10.38,"datetime":"2017-01-17 18:00"},{"direction":330.89,"speed":10.72,"datetime":"2017-01-17 19:00"},{"direction":333.26,"speed":11.28,"datetime":"2017-01-17 20:00"},{"direction":332.74,"speed":11.33,"datetime":"2017-01-17 21:00"},{"direction":331.16,"speed":10.99,"datetime":"2017-01-17 22:00"}],"temperature":[{"value":-4,"datetime":"2017-01-15 23:00"},{"value":-5.01,"datetime":"2017-01-16 00:00"},{"value":-5.94,"datetime":"2017-01-16 01:00"},{"value":-6.72,"datetime":"2017-01-16 02:00"},{"value":-7.31,"datetime":"2017-01-16 03:00"},{"value":-7.91,"datetime":"2017-01-16 04:00"},{"value":-8.79,"datetime":"2017-01-16 05:00"},{"value":-9.27,"datetime":"2017-01-16 06:00"},{"value":-9.6,"datetime":"2017-01-16 07:00"},{"value":-9.12,"datetime":"2017-01-16 08:00"},{"value":-7.39,"datetime":"2017-01-16 09:00"},{"value":-4.95,"datetime":"2017-01-16 10:00"},{"value":-2.61,"datetime":"2017-01-16 11:00"},{"value":-1.04,"datetime":"2017-01-16 12:00"},{"value":-0.44,"datetime":"2017-01-16 13:00"},{"value":-0.89,"datetime":"2017-01-16 14:00"},{"value":-2.33,"datetime":"2017-01-16 15:00"},{"value":-4.21,"datetime":"2017-01-16 16:00"},{"value":-5.84,"datetime":"2017-01-16 17:00"},{"value":-6.74,"datetime":"2017-01-16 18:00"},{"value":-7.06,"datetime":"2017-01-16 19:00"},{"value":-7.19,"datetime":"2017-01-16 20:00"},{"value":-7.4,"datetime":"2017-01-16 21:00"},{"value":-7.7,"datetime":"2017-01-16 22:00"},{"value":-8.03,"datetime":"2017-01-16 23:00"},{"value":-8.34,"datetime":"2017-01-17 00:00"},{"value":-8.61,"datetime":"2017-01-17 01:00"},{"value":-8.81,"datetime":"2017-01-17 02:00"},{"value":-8.97,"datetime":"2017-01-17 03:00"},{"value":-9.17,"datetime":"2017-01-17 04:00"},{"value":-9.52,"datetime":"2017-01-17 05:00"},{"value":-10.02,"datetime":"2017-01-17 06:00"},{"value":-10.19,"datetime":"2017-01-17 07:00"},{"value":-9.42,"datetime":"2017-01-17 08:00"},{"value":-7.36,"datetime":"2017-01-17 09:00"},{"value":-4.52,"datetime":"2017-01-17 10:00"},{"value":-1.65,"datetime":"2017-01-17 11:00"},{"value":0.58,"datetime":"2017-01-17 12:00"},{"value":1.85,"datetime":"2017-01-17 13:00"},{"value":1.95,"datetime":"2017-01-17 14:00"},{"value":0.78,"datetime":"2017-01-17 15:00"},{"value":-1.07,"datetime":"2017-01-17 16:00"},{"value":-2.92,"datetime":"2017-01-17 17:00"},{"value":-4.18,"datetime":"2017-01-17 18:00"},{"value":-4.94,"datetime":"2017-01-17 19:00"},{"value":-5.4,"datetime":"2017-01-17 20:00"},{"value":-5.75,"datetime":"2017-01-17 21:00"},{"value":-6.07,"datetime":"2017-01-17 22:00"}]}
         * minutely : {"status":"ok","description":"雷达数据还在收集中\u2026\u2026但小彩云觉得不会下雪呢","probability":[0,0,0,0],"datasource":"gfs","precipitation_2h":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"precipitation":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]}
         * daily : {"status":"ok","coldRisk":[{"index":"4","desc":"极易发","datetime":"2017-01-15"},{"index":"4","desc":"极易发","datetime":"2017-01-16"},{"index":"4","desc":"极易发","datetime":"2017-01-17"},{"index":"4","desc":"极易发","datetime":"2017-01-18"},{"index":"4","desc":"极易发","datetime":"2017-01-19"}],"temperature":[{"date":"2017-01-15","max":-2.5,"avg":-4,"min":-10.03},{"date":"2017-01-16","max":-0.44,"avg":-5.98,"min":-9.6},{"date":"2017-01-17","max":1.95,"avg":-5.34,"min":-10.19},{"date":"2017-01-18","max":-0.44,"avg":-5.53,"min":-8.88},{"date":"2017-01-19","max":-2.49,"avg":-6.48,"min":-10.42}],"skycon":[{"date":"2017-01-15","value":"CLOUDY"},{"date":"2017-01-16","value":"PARTLY_CLOUDY_DAY"},{"date":"2017-01-17","value":"CLEAR_DAY"},{"date":"2017-01-18","value":"PARTLY_CLOUDY_DAY"},{"date":"2017-01-19","value":"PARTLY_CLOUDY_DAY"}],"cloudrate":[{"date":"2017-01-15","max":1,"avg":0.81,"min":0.06},{"date":"2017-01-16","max":1,"avg":0.38,"min":0},{"date":"2017-01-17","max":0,"avg":0,"min":0},{"date":"2017-01-18","max":0.99,"avg":0.23,"min":0},{"date":"2017-01-19","max":1,"avg":0.53,"min":0}],"aqi":[{"date":"2017-01-15","max":123,"avg":115,"min":55},{"date":"2017-01-16","max":193,"avg":156.92,"min":119},{"date":"2017-01-17","max":227,"avg":173.38,"min":113},{"date":"2017-01-18","max":194,"avg":163.83,"min":146},{"date":"2017-01-19","max":227,"avg":96.54,"min":7}],"humidity":[{"date":"2017-01-15","max":0.93,"avg":0.86,"min":0.47},{"date":"2017-01-16","max":0.89,"avg":0.75,"min":0.43},{"date":"2017-01-17","max":0.92,"avg":0.58,"min":0.2},{"date":"2017-01-18","max":0.48,"avg":0.4,"min":0.22},{"date":"2017-01-19","max":0.57,"avg":0.37,"min":0.18}],"astro":[{"date":"2017-01-15","sunset":{"time":"17:11"},"sunrise":{"time":"07:34"}},{"date":"2017-01-16","sunset":{"time":"17:12"},"sunrise":{"time":"07:33"}},{"date":"2017-01-17","sunset":{"time":"17:13"},"sunrise":{"time":"07:33"}},{"date":"2017-01-18","sunset":{"time":"17:14"},"sunrise":{"time":"07:32"}},{"date":"2017-01-19","sunset":{"time":"17:16"},"sunrise":{"time":"07:32"}}],"ultraviolet":[{"index":"1","desc":"最弱","datetime":"2017-01-15"},{"index":"4","desc":"强","datetime":"2017-01-16"},{"index":"4","desc":"强","datetime":"2017-01-17"},{"index":"4","desc":"强","datetime":"2017-01-18"},{"index":"3","desc":"中等","datetime":"2017-01-19"}],"pm25":[{"date":"2017-01-15","max":93,"avg":87,"min":36},{"date":"2017-01-16","max":145,"avg":118.92,"min":90},{"date":"2017-01-17","max":176,"avg":131.54,"min":85},{"date":"2017-01-18","max":146,"avg":124.38,"min":112},{"date":"2017-01-19","max":176,"avg":71.71,"min":3}],"dressing":[{"index":"8","desc":"极冷","datetime":"2017-01-15"},{"index":"8","desc":"极冷","datetime":"2017-01-16"},{"index":"8","desc":"极冷","datetime":"2017-01-17"},{"index":"8","desc":"极冷","datetime":"2017-01-18"},{"index":"8","desc":"极冷","datetime":"2017-01-19"}],"carWashing":[{"index":"2","desc":"较适宜","datetime":"2017-01-15"},{"index":"2","desc":"较适宜","datetime":"2017-01-16"},{"index":"2","desc":"较适宜","datetime":"2017-01-17"},{"index":"2","desc":"较适宜","datetime":"2017-01-18"},{"index":"2","desc":"较适宜","datetime":"2017-01-19"}],"precipitation":[{"date":"2017-01-15","max":0,"avg":0,"min":0},{"date":"2017-01-16","max":0,"avg":0,"min":0},{"date":"2017-01-17","max":0,"avg":0,"min":0},{"date":"2017-01-18","max":0,"avg":0,"min":0},{"date":"2017-01-19","max":0,"avg":0,"min":0}],"wind":[{"date":"2017-01-15","max":{"direction":184.91,"speed":8.45},"avg":{"direction":147.71,"speed":4.59},"min":{"direction":111.16,"speed":2.52}},{"date":"2017-01-16","max":{"direction":168.15,"speed":8.24},"avg":{"direction":99.51,"speed":3.49},"min":{"direction":125.66,"speed":1.08}},{"date":"2017-01-17","max":{"direction":294.59,"speed":17.67},"avg":{"direction":310.67,"speed":7.04},"min":{"direction":187.47,"speed":0.33}},{"date":"2017-01-18","max":{"direction":347.92,"speed":10.63},"avg":{"direction":345.7,"speed":7.22},"min":{"direction":153.81,"speed":0.83}},{"date":"2017-01-19","max":{"direction":332.25,"speed":23.09},"avg":{"direction":330.81,"speed":12.29},"min":{"direction":42.19,"speed":1.68}}]}
         * primary : 0
         */

        private HourlyBean hourly;
        private MinutelyBean minutely;
        private DailyBean daily;
        private int primary;

        public HourlyBean getHourly() {
            return hourly;
        }

        public void setHourly(HourlyBean hourly) {
            this.hourly = hourly;
        }

        public MinutelyBean getMinutely() {
            return minutely;
        }

        public void setMinutely(MinutelyBean minutely) {
            this.minutely = minutely;
        }

        public DailyBean getDaily() {
            return daily;
        }

        public void setDaily(DailyBean daily) {
            this.daily = daily;
        }

        public int getPrimary() {
            return primary;
        }

        public void setPrimary(int primary) {
            this.primary = primary;
        }

        public static class HourlyBean {
            /**
             * status : ok
             * description : 多云，明天下午16点钟后转晴
             * skycon : [{"value":"CLOUDY","datetime":"2017-01-15 23:00"},{"value":"CLOUDY","datetime":"2017-01-16 00:00"},{"value":"CLOUDY","datetime":"2017-01-16 01:00"},{"value":"PARTLY_CLOUDY_NIGHT","datetime":"2017-01-16 02:00"},{"value":"CLOUDY","datetime":"2017-01-16 03:00"},{"value":"CLOUDY","datetime":"2017-01-16 04:00"},{"value":"CLOUDY","datetime":"2017-01-16 05:00"},{"value":"CLOUDY","datetime":"2017-01-16 06:00"},{"value":"CLOUDY","datetime":"2017-01-16 07:00"},{"value":"CLOUDY","datetime":"2017-01-16 08:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2017-01-16 09:00"},{"value":"PARTLY_CLOUDY_DAY","datetime":"2017-01-16 10:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 11:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 12:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 13:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 14:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 15:00"},{"value":"CLEAR_DAY","datetime":"2017-01-16 16:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 17:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 18:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 19:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 20:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 21:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 22:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-16 23:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 00:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 01:00"},{"value":"HAZE","datetime":"2017-01-17 02:00"},{"value":"HAZE","datetime":"2017-01-17 03:00"},{"value":"HAZE","datetime":"2017-01-17 04:00"},{"value":"HAZE","datetime":"2017-01-17 05:00"},{"value":"HAZE","datetime":"2017-01-17 06:00"},{"value":"HAZE","datetime":"2017-01-17 07:00"},{"value":"HAZE","datetime":"2017-01-17 08:00"},{"value":"HAZE","datetime":"2017-01-17 09:00"},{"value":"HAZE","datetime":"2017-01-17 10:00"},{"value":"HAZE","datetime":"2017-01-17 11:00"},{"value":"CLEAR_DAY","datetime":"2017-01-17 12:00"},{"value":"CLEAR_DAY","datetime":"2017-01-17 13:00"},{"value":"CLEAR_DAY","datetime":"2017-01-17 14:00"},{"value":"CLEAR_DAY","datetime":"2017-01-17 15:00"},{"value":"CLEAR_DAY","datetime":"2017-01-17 16:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 17:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 18:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 19:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 20:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 21:00"},{"value":"CLEAR_NIGHT","datetime":"2017-01-17 22:00"}]
             * cloudrate : [{"value":0.81,"datetime":"2017-01-15 23:00"},{"value":0.87,"datetime":"2017-01-16 00:00"},{"value":0.84,"datetime":"2017-01-16 01:00"},{"value":0.8,"datetime":"2017-01-16 02:00"},{"value":0.81,"datetime":"2017-01-16 03:00"},{"value":0.87,"datetime":"2017-01-16 04:00"},{"value":0.94,"datetime":"2017-01-16 05:00"},{"value":1,"datetime":"2017-01-16 06:00"},{"value":1,"datetime":"2017-01-16 07:00"},{"value":0.91,"datetime":"2017-01-16 08:00"},{"value":0.63,"datetime":"2017-01-16 09:00"},{"value":0.29,"datetime":"2017-01-16 10:00"},{"value":0.03,"datetime":"2017-01-16 11:00"},{"value":0,"datetime":"2017-01-16 12:00"},{"value":0,"datetime":"2017-01-16 13:00"},{"value":0.02,"datetime":"2017-01-16 14:00"},{"value":0.04,"datetime":"2017-01-16 15:00"},{"value":0.02,"datetime":"2017-01-16 16:00"},{"value":0,"datetime":"2017-01-16 17:00"},{"value":0,"datetime":"2017-01-16 18:00"},{"value":0,"datetime":"2017-01-16 19:00"},{"value":0,"datetime":"2017-01-16 20:00"},{"value":0,"datetime":"2017-01-16 21:00"},{"value":0,"datetime":"2017-01-16 22:00"},{"value":0,"datetime":"2017-01-16 23:00"},{"value":0,"datetime":"2017-01-17 00:00"},{"value":0,"datetime":"2017-01-17 01:00"},{"value":0,"datetime":"2017-01-17 02:00"},{"value":0,"datetime":"2017-01-17 03:00"},{"value":0,"datetime":"2017-01-17 04:00"},{"value":0,"datetime":"2017-01-17 05:00"},{"value":0,"datetime":"2017-01-17 06:00"},{"value":0,"datetime":"2017-01-17 07:00"},{"value":0,"datetime":"2017-01-17 08:00"},{"value":0,"datetime":"2017-01-17 09:00"},{"value":0,"datetime":"2017-01-17 10:00"},{"value":0,"datetime":"2017-01-17 11:00"},{"value":0,"datetime":"2017-01-17 12:00"},{"value":0,"datetime":"2017-01-17 13:00"},{"value":0,"datetime":"2017-01-17 14:00"},{"value":0,"datetime":"2017-01-17 15:00"},{"value":0,"datetime":"2017-01-17 16:00"},{"value":0,"datetime":"2017-01-17 17:00"},{"value":0,"datetime":"2017-01-17 18:00"},{"value":0,"datetime":"2017-01-17 19:00"},{"value":0,"datetime":"2017-01-17 20:00"},{"value":0,"datetime":"2017-01-17 21:00"},{"value":0,"datetime":"2017-01-17 22:00"}]
             * aqi : [{"value":115,"datetime":"2017-01-15 23:00"},{"value":119,"datetime":"2017-01-16 00:00"},{"value":123,"datetime":"2017-01-16 01:00"},{"value":125,"datetime":"2017-01-16 02:00"},{"value":129,"datetime":"2017-01-16 03:00"},{"value":133,"datetime":"2017-01-16 04:00"},{"value":135,"datetime":"2017-01-16 05:00"},{"value":139,"datetime":"2017-01-16 06:00"},{"value":143,"datetime":"2017-01-16 07:00"},{"value":145,"datetime":"2017-01-16 08:00"},{"value":149,"datetime":"2017-01-16 09:00"},{"value":152,"datetime":"2017-01-16 10:00"},{"value":155,"datetime":"2017-01-16 11:00"},{"value":159,"datetime":"2017-01-16 12:00"},{"value":162,"datetime":"2017-01-16 13:00"},{"value":166,"datetime":"2017-01-16 14:00"},{"value":169,"datetime":"2017-01-16 15:00"},{"value":172,"datetime":"2017-01-16 16:00"},{"value":175,"datetime":"2017-01-16 17:00"},{"value":179,"datetime":"2017-01-16 18:00"},{"value":182,"datetime":"2017-01-16 19:00"},{"value":185,"datetime":"2017-01-16 20:00"},{"value":187,"datetime":"2017-01-16 21:00"},{"value":190,"datetime":"2017-01-16 22:00"},{"value":193,"datetime":"2017-01-16 23:00"},{"value":196,"datetime":"2017-01-17 00:00"},{"value":199,"datetime":"2017-01-17 01:00"},{"value":203,"datetime":"2017-01-17 02:00"},{"value":205,"datetime":"2017-01-17 03:00"},{"value":207,"datetime":"2017-01-17 04:00"},{"value":209,"datetime":"2017-01-17 05:00"},{"value":209,"datetime":"2017-01-17 06:00"},{"value":210,"datetime":"2017-01-17 07:00"},{"value":215,"datetime":"2017-01-17 08:00"},{"value":222,"datetime":"2017-01-17 09:00"},{"value":227,"datetime":"2017-01-17 10:00"},{"value":220,"datetime":"2017-01-17 11:00"},{"value":194,"datetime":"2017-01-17 12:00"},{"value":152,"datetime":"2017-01-17 13:00"},{"value":123,"datetime":"2017-01-17 14:00"},{"value":113,"datetime":"2017-01-17 15:00"},{"value":117,"datetime":"2017-01-17 16:00"},{"value":125,"datetime":"2017-01-17 17:00"},{"value":130,"datetime":"2017-01-17 18:00"},{"value":133,"datetime":"2017-01-17 19:00"},{"value":134,"datetime":"2017-01-17 20:00"},{"value":136,"datetime":"2017-01-17 21:00"},{"value":139,"datetime":"2017-01-17 22:00"}]
             * humidity : [{"value":0.86,"datetime":"2017-01-15 23:00"},{"value":0.86,"datetime":"2017-01-16 00:00"},{"value":0.87,"datetime":"2017-01-16 01:00"},{"value":0.86,"datetime":"2017-01-16 02:00"},{"value":0.85,"datetime":"2017-01-16 03:00"},{"value":0.85,"datetime":"2017-01-16 04:00"},{"value":0.86,"datetime":"2017-01-16 05:00"},{"value":0.88,"datetime":"2017-01-16 06:00"},{"value":0.89,"datetime":"2017-01-16 07:00"},{"value":0.86,"datetime":"2017-01-16 08:00"},{"value":0.76,"datetime":"2017-01-16 09:00"},{"value":0.63,"datetime":"2017-01-16 10:00"},{"value":0.51,"datetime":"2017-01-16 11:00"},{"value":0.44,"datetime":"2017-01-16 12:00"},{"value":0.43,"datetime":"2017-01-16 13:00"},{"value":0.47,"datetime":"2017-01-16 14:00"},{"value":0.54,"datetime":"2017-01-16 15:00"},{"value":0.63,"datetime":"2017-01-16 16:00"},{"value":0.72,"datetime":"2017-01-16 17:00"},{"value":0.78,"datetime":"2017-01-16 18:00"},{"value":0.82,"datetime":"2017-01-16 19:00"},{"value":0.84,"datetime":"2017-01-16 20:00"},{"value":0.84,"datetime":"2017-01-16 21:00"},{"value":0.85,"datetime":"2017-01-16 22:00"},{"value":0.85,"datetime":"2017-01-16 23:00"},{"value":0.85,"datetime":"2017-01-17 00:00"},{"value":0.86,"datetime":"2017-01-17 01:00"},{"value":0.87,"datetime":"2017-01-17 02:00"},{"value":0.87,"datetime":"2017-01-17 03:00"},{"value":0.87,"datetime":"2017-01-17 04:00"},{"value":0.89,"datetime":"2017-01-17 05:00"},{"value":0.91,"datetime":"2017-01-17 06:00"},{"value":0.92,"datetime":"2017-01-17 07:00"},{"value":0.9,"datetime":"2017-01-17 08:00"},{"value":0.82,"datetime":"2017-01-17 09:00"},{"value":0.69,"datetime":"2017-01-17 10:00"},{"value":0.55,"datetime":"2017-01-17 11:00"},{"value":0.4,"datetime":"2017-01-17 12:00"},{"value":0.28,"datetime":"2017-01-17 13:00"},{"value":0.21,"datetime":"2017-01-17 14:00"},{"value":0.2,"datetime":"2017-01-17 15:00"},{"value":0.24,"datetime":"2017-01-17 16:00"},{"value":0.3,"datetime":"2017-01-17 17:00"},{"value":0.35,"datetime":"2017-01-17 18:00"},{"value":0.38,"datetime":"2017-01-17 19:00"},{"value":0.4,"datetime":"2017-01-17 20:00"},{"value":0.42,"datetime":"2017-01-17 21:00"},{"value":0.43,"datetime":"2017-01-17 22:00"}]
             * pm25 : [{"value":87,"datetime":"2017-01-15 23:00"},{"value":90,"datetime":"2017-01-16 00:00"},{"value":93,"datetime":"2017-01-16 01:00"},{"value":95,"datetime":"2017-01-16 02:00"},{"value":98,"datetime":"2017-01-16 03:00"},{"value":101,"datetime":"2017-01-16 04:00"},{"value":103,"datetime":"2017-01-16 05:00"},{"value":106,"datetime":"2017-01-16 06:00"},{"value":109,"datetime":"2017-01-16 07:00"},{"value":111,"datetime":"2017-01-16 08:00"},{"value":114,"datetime":"2017-01-16 09:00"},{"value":116,"datetime":"2017-01-16 10:00"},{"value":118,"datetime":"2017-01-16 11:00"},{"value":121,"datetime":"2017-01-16 12:00"},{"value":123,"datetime":"2017-01-16 13:00"},{"value":126,"datetime":"2017-01-16 14:00"},{"value":128,"datetime":"2017-01-16 15:00"},{"value":130,"datetime":"2017-01-16 16:00"},{"value":132,"datetime":"2017-01-16 17:00"},{"value":135,"datetime":"2017-01-16 18:00"},{"value":137,"datetime":"2017-01-16 19:00"},{"value":139,"datetime":"2017-01-16 20:00"},{"value":141,"datetime":"2017-01-16 21:00"},{"value":143,"datetime":"2017-01-16 22:00"},{"value":145,"datetime":"2017-01-16 23:00"},{"value":147,"datetime":"2017-01-17 00:00"},{"value":149,"datetime":"2017-01-17 01:00"},{"value":152,"datetime":"2017-01-17 02:00"},{"value":154,"datetime":"2017-01-17 03:00"},{"value":156,"datetime":"2017-01-17 04:00"},{"value":158,"datetime":"2017-01-17 05:00"},{"value":158,"datetime":"2017-01-17 06:00"},{"value":159,"datetime":"2017-01-17 07:00"},{"value":164,"datetime":"2017-01-17 08:00"},{"value":171,"datetime":"2017-01-17 09:00"},{"value":176,"datetime":"2017-01-17 10:00"},{"value":169,"datetime":"2017-01-17 11:00"},{"value":146,"datetime":"2017-01-17 12:00"},{"value":116,"datetime":"2017-01-17 13:00"},{"value":93,"datetime":"2017-01-17 14:00"},{"value":85,"datetime":"2017-01-17 15:00"},{"value":88,"datetime":"2017-01-17 16:00"},{"value":95,"datetime":"2017-01-17 17:00"},{"value":99,"datetime":"2017-01-17 18:00"},{"value":101,"datetime":"2017-01-17 19:00"},{"value":102,"datetime":"2017-01-17 20:00"},{"value":104,"datetime":"2017-01-17 21:00"},{"value":106,"datetime":"2017-01-17 22:00"}]
             * precipitation : [{"value":0,"datetime":"2017-01-15 23:00"},{"value":0,"datetime":"2017-01-16 00:00"},{"value":0,"datetime":"2017-01-16 01:00"},{"value":0,"datetime":"2017-01-16 02:00"},{"value":0,"datetime":"2017-01-16 03:00"},{"value":0,"datetime":"2017-01-16 04:00"},{"value":0,"datetime":"2017-01-16 05:00"},{"value":0,"datetime":"2017-01-16 06:00"},{"value":0,"datetime":"2017-01-16 07:00"},{"value":0,"datetime":"2017-01-16 08:00"},{"value":0,"datetime":"2017-01-16 09:00"},{"value":0,"datetime":"2017-01-16 10:00"},{"value":0,"datetime":"2017-01-16 11:00"},{"value":0,"datetime":"2017-01-16 12:00"},{"value":0,"datetime":"2017-01-16 13:00"},{"value":0,"datetime":"2017-01-16 14:00"},{"value":0,"datetime":"2017-01-16 15:00"},{"value":0,"datetime":"2017-01-16 16:00"},{"value":0,"datetime":"2017-01-16 17:00"},{"value":0,"datetime":"2017-01-16 18:00"},{"value":0,"datetime":"2017-01-16 19:00"},{"value":0,"datetime":"2017-01-16 20:00"},{"value":0,"datetime":"2017-01-16 21:00"},{"value":0,"datetime":"2017-01-16 22:00"},{"value":0,"datetime":"2017-01-16 23:00"},{"value":0,"datetime":"2017-01-17 00:00"},{"value":0,"datetime":"2017-01-17 01:00"},{"value":0,"datetime":"2017-01-17 02:00"},{"value":0,"datetime":"2017-01-17 03:00"},{"value":0,"datetime":"2017-01-17 04:00"},{"value":0,"datetime":"2017-01-17 05:00"},{"value":0,"datetime":"2017-01-17 06:00"},{"value":0,"datetime":"2017-01-17 07:00"},{"value":0,"datetime":"2017-01-17 08:00"},{"value":0,"datetime":"2017-01-17 09:00"},{"value":0,"datetime":"2017-01-17 10:00"},{"value":0,"datetime":"2017-01-17 11:00"},{"value":0,"datetime":"2017-01-17 12:00"},{"value":0,"datetime":"2017-01-17 13:00"},{"value":0,"datetime":"2017-01-17 14:00"},{"value":0,"datetime":"2017-01-17 15:00"},{"value":0,"datetime":"2017-01-17 16:00"},{"value":0,"datetime":"2017-01-17 17:00"},{"value":0,"datetime":"2017-01-17 18:00"},{"value":0,"datetime":"2017-01-17 19:00"},{"value":0,"datetime":"2017-01-17 20:00"},{"value":0,"datetime":"2017-01-17 21:00"},{"value":0,"datetime":"2017-01-17 22:00"}]
             * wind : [{"direction":19.98,"speed":3.55,"datetime":"2017-01-15 23:00"},{"direction":21.98,"speed":3.28,"datetime":"2017-01-16 00:00"},{"direction":25.6,"speed":3.03,"datetime":"2017-01-16 01:00"},{"direction":27.36,"speed":2.84,"datetime":"2017-01-16 02:00"},{"direction":23.84,"speed":2.73,"datetime":"2017-01-16 03:00"},{"direction":16.17,"speed":2.74,"datetime":"2017-01-16 04:00"},{"direction":7.6,"speed":2.88,"datetime":"2017-01-16 05:00"},{"direction":1.13,"speed":3.09,"datetime":"2017-01-16 06:00"},{"direction":358.05,"speed":3.08,"datetime":"2017-01-16 07:00"},{"direction":359.45,"speed":2.53,"datetime":"2017-01-16 08:00"},{"direction":15.55,"speed":1.3,"datetime":"2017-01-16 09:00"},{"direction":125.66,"speed":1.08,"datetime":"2017-01-16 10:00"},{"direction":154.52,"speed":3.21,"datetime":"2017-01-16 11:00"},{"direction":162.07,"speed":5.53,"datetime":"2017-01-16 12:00"},{"direction":165.87,"speed":7.41,"datetime":"2017-01-16 13:00"},{"direction":168.15,"speed":8.24,"datetime":"2017-01-16 14:00"},{"direction":169.58,"speed":7.62,"datetime":"2017-01-16 15:00"},{"direction":170.13,"speed":5.85,"datetime":"2017-01-16 16:00"},{"direction":167.67,"speed":3.47,"datetime":"2017-01-16 17:00"},{"direction":139.95,"speed":1.11,"datetime":"2017-01-16 18:00"},{"direction":32.43,"speed":1.61,"datetime":"2017-01-16 19:00"},{"direction":21.41,"speed":2.95,"datetime":"2017-01-16 20:00"},{"direction":22.82,"speed":3.26,"datetime":"2017-01-16 21:00"},{"direction":28.95,"speed":2.84,"datetime":"2017-01-16 22:00"},{"direction":38.61,"speed":2.2,"datetime":"2017-01-16 23:00"},{"direction":47.82,"speed":1.68,"datetime":"2017-01-17 00:00"},{"direction":56.46,"speed":1.25,"datetime":"2017-01-17 01:00"},{"direction":71.16,"speed":0.89,"datetime":"2017-01-17 02:00"},{"direction":102.07,"speed":0.7,"datetime":"2017-01-17 03:00"},{"direction":134.36,"speed":0.62,"datetime":"2017-01-17 04:00"},{"direction":187.47,"speed":0.33,"datetime":"2017-01-17 05:00"},{"direction":288.04,"speed":0.88,"datetime":"2017-01-17 06:00"},{"direction":299.33,"speed":1.9,"datetime":"2017-01-17 07:00"},{"direction":296.84,"speed":2.36,"datetime":"2017-01-17 08:00"},{"direction":280.63,"speed":2.13,"datetime":"2017-01-17 09:00"},{"direction":263.21,"speed":2.53,"datetime":"2017-01-17 10:00"},{"direction":270.88,"speed":4.55,"datetime":"2017-01-17 11:00"},{"direction":283.86,"speed":9.04,"datetime":"2017-01-17 12:00"},{"direction":290.61,"speed":14.33,"datetime":"2017-01-17 13:00"},{"direction":294.59,"speed":17.67,"datetime":"2017-01-17 14:00"},{"direction":298.3,"speed":17.13,"datetime":"2017-01-17 15:00"},{"direction":303.98,"speed":14.22,"datetime":"2017-01-17 16:00"},{"direction":313.4,"speed":11.36,"datetime":"2017-01-17 17:00"},{"direction":324.03,"speed":10.38,"datetime":"2017-01-17 18:00"},{"direction":330.89,"speed":10.72,"datetime":"2017-01-17 19:00"},{"direction":333.26,"speed":11.28,"datetime":"2017-01-17 20:00"},{"direction":332.74,"speed":11.33,"datetime":"2017-01-17 21:00"},{"direction":331.16,"speed":10.99,"datetime":"2017-01-17 22:00"}]
             * temperature : [{"value":-4,"datetime":"2017-01-15 23:00"},{"value":-5.01,"datetime":"2017-01-16 00:00"},{"value":-5.94,"datetime":"2017-01-16 01:00"},{"value":-6.72,"datetime":"2017-01-16 02:00"},{"value":-7.31,"datetime":"2017-01-16 03:00"},{"value":-7.91,"datetime":"2017-01-16 04:00"},{"value":-8.79,"datetime":"2017-01-16 05:00"},{"value":-9.27,"datetime":"2017-01-16 06:00"},{"value":-9.6,"datetime":"2017-01-16 07:00"},{"value":-9.12,"datetime":"2017-01-16 08:00"},{"value":-7.39,"datetime":"2017-01-16 09:00"},{"value":-4.95,"datetime":"2017-01-16 10:00"},{"value":-2.61,"datetime":"2017-01-16 11:00"},{"value":-1.04,"datetime":"2017-01-16 12:00"},{"value":-0.44,"datetime":"2017-01-16 13:00"},{"value":-0.89,"datetime":"2017-01-16 14:00"},{"value":-2.33,"datetime":"2017-01-16 15:00"},{"value":-4.21,"datetime":"2017-01-16 16:00"},{"value":-5.84,"datetime":"2017-01-16 17:00"},{"value":-6.74,"datetime":"2017-01-16 18:00"},{"value":-7.06,"datetime":"2017-01-16 19:00"},{"value":-7.19,"datetime":"2017-01-16 20:00"},{"value":-7.4,"datetime":"2017-01-16 21:00"},{"value":-7.7,"datetime":"2017-01-16 22:00"},{"value":-8.03,"datetime":"2017-01-16 23:00"},{"value":-8.34,"datetime":"2017-01-17 00:00"},{"value":-8.61,"datetime":"2017-01-17 01:00"},{"value":-8.81,"datetime":"2017-01-17 02:00"},{"value":-8.97,"datetime":"2017-01-17 03:00"},{"value":-9.17,"datetime":"2017-01-17 04:00"},{"value":-9.52,"datetime":"2017-01-17 05:00"},{"value":-10.02,"datetime":"2017-01-17 06:00"},{"value":-10.19,"datetime":"2017-01-17 07:00"},{"value":-9.42,"datetime":"2017-01-17 08:00"},{"value":-7.36,"datetime":"2017-01-17 09:00"},{"value":-4.52,"datetime":"2017-01-17 10:00"},{"value":-1.65,"datetime":"2017-01-17 11:00"},{"value":0.58,"datetime":"2017-01-17 12:00"},{"value":1.85,"datetime":"2017-01-17 13:00"},{"value":1.95,"datetime":"2017-01-17 14:00"},{"value":0.78,"datetime":"2017-01-17 15:00"},{"value":-1.07,"datetime":"2017-01-17 16:00"},{"value":-2.92,"datetime":"2017-01-17 17:00"},{"value":-4.18,"datetime":"2017-01-17 18:00"},{"value":-4.94,"datetime":"2017-01-17 19:00"},{"value":-5.4,"datetime":"2017-01-17 20:00"},{"value":-5.75,"datetime":"2017-01-17 21:00"},{"value":-6.07,"datetime":"2017-01-17 22:00"}]
             */

            private String status;
            private String description;
            private List<SkyconBean> skycon;
            private List<CloudrateBean> cloudrate;
            private List<AqiBean> aqi;
            private List<HumidityBean> humidity;
            private List<Pm25Bean> pm25;
            private List<PrecipitationBean> precipitation;
            private List<WindBean> wind;
            private List<TemperatureBean> temperature;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public List<SkyconBean> getSkycon() {
                return skycon;
            }

            public void setSkycon(List<SkyconBean> skycon) {
                this.skycon = skycon;
            }

            public List<CloudrateBean> getCloudrate() {
                return cloudrate;
            }

            public void setCloudrate(List<CloudrateBean> cloudrate) {
                this.cloudrate = cloudrate;
            }

            public List<AqiBean> getAqi() {
                return aqi;
            }

            public void setAqi(List<AqiBean> aqi) {
                this.aqi = aqi;
            }

            public List<HumidityBean> getHumidity() {
                return humidity;
            }

            public void setHumidity(List<HumidityBean> humidity) {
                this.humidity = humidity;
            }

            public List<Pm25Bean> getPm25() {
                return pm25;
            }

            public void setPm25(List<Pm25Bean> pm25) {
                this.pm25 = pm25;
            }

            public List<PrecipitationBean> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<PrecipitationBean> precipitation) {
                this.precipitation = precipitation;
            }

            public List<WindBean> getWind() {
                return wind;
            }

            public void setWind(List<WindBean> wind) {
                this.wind = wind;
            }

            public List<TemperatureBean> getTemperature() {
                return temperature;
            }

            public void setTemperature(List<TemperatureBean> temperature) {
                this.temperature = temperature;
            }

            public static class SkyconBean {
                /**
                 * value : CLOUDY
                 * datetime : 2017-01-15 23:00
                 */

                private String value;
                private String datetime;

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class CloudrateBean {
                /**
                 * value : 0.81
                 * datetime : 2017-01-15 23:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class AqiBean {
                /**
                 * value : 115
                 * datetime : 2017-01-15 23:00
                 */

                private int value;
                private String datetime;

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class HumidityBean {
                /**
                 * value : 0.86
                 * datetime : 2017-01-15 23:00
                 */

                private double value;
                private String datetime;

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class Pm25Bean {
                /**
                 * value : 87
                 * datetime : 2017-01-15 23:00
                 */

                private int value;
                private String datetime;

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class PrecipitationBean {
                /**
                 * value : 0
                 * datetime : 2017-01-15 23:00
                 */

                private int value;
                private String datetime;

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class WindBean {
                /**
                 * direction : 19.98
                 * speed : 3.55
                 * datetime : 2017-01-15 23:00
                 */

                private double direction;
                private double speed;
                private String datetime;

                public double getDirection() {
                    return direction;
                }

                public void setDirection(double direction) {
                    this.direction = direction;
                }

                public double getSpeed() {
                    return speed;
                }

                public void setSpeed(double speed) {
                    this.speed = speed;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class TemperatureBean {
                /**
                 * value : -4
                 * datetime : 2017-01-15 23:00
                 */

                private int value;
                private String datetime;

                public int getValue() {
                    return value;
                }

                public void setValue(int value) {
                    this.value = value;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }
        }

        public static class MinutelyBean {
            /**
             * status : ok
             * description : 雷达数据还在收集中……但小彩云觉得不会下雪呢
             * probability : [0,0,0,0]
             * datasource : gfs
             * precipitation_2h : [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
             * precipitation : [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
             */

            private String status;
            private String description;
            private String datasource;
            private List<Integer> probability;
            private List<Integer> precipitation_2h;
            private List<Integer> precipitation;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getDatasource() {
                return datasource;
            }

            public void setDatasource(String datasource) {
                this.datasource = datasource;
            }

            public List<Integer> getProbability() {
                return probability;
            }

            public void setProbability(List<Integer> probability) {
                this.probability = probability;
            }

            public List<Integer> getPrecipitation_2h() {
                return precipitation_2h;
            }

            public void setPrecipitation_2h(List<Integer> precipitation_2h) {
                this.precipitation_2h = precipitation_2h;
            }

            public List<Integer> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<Integer> precipitation) {
                this.precipitation = precipitation;
            }
        }

        public static class DailyBean {
            /**
             * status : ok
             * coldRisk : [{"index":"4","desc":"极易发","datetime":"2017-01-15"},{"index":"4","desc":"极易发","datetime":"2017-01-16"},{"index":"4","desc":"极易发","datetime":"2017-01-17"},{"index":"4","desc":"极易发","datetime":"2017-01-18"},{"index":"4","desc":"极易发","datetime":"2017-01-19"}]
             * temperature : [{"date":"2017-01-15","max":-2.5,"avg":-4,"min":-10.03},{"date":"2017-01-16","max":-0.44,"avg":-5.98,"min":-9.6},{"date":"2017-01-17","max":1.95,"avg":-5.34,"min":-10.19},{"date":"2017-01-18","max":-0.44,"avg":-5.53,"min":-8.88},{"date":"2017-01-19","max":-2.49,"avg":-6.48,"min":-10.42}]
             * skycon : [{"date":"2017-01-15","value":"CLOUDY"},{"date":"2017-01-16","value":"PARTLY_CLOUDY_DAY"},{"date":"2017-01-17","value":"CLEAR_DAY"},{"date":"2017-01-18","value":"PARTLY_CLOUDY_DAY"},{"date":"2017-01-19","value":"PARTLY_CLOUDY_DAY"}]
             * cloudrate : [{"date":"2017-01-15","max":1,"avg":0.81,"min":0.06},{"date":"2017-01-16","max":1,"avg":0.38,"min":0},{"date":"2017-01-17","max":0,"avg":0,"min":0},{"date":"2017-01-18","max":0.99,"avg":0.23,"min":0},{"date":"2017-01-19","max":1,"avg":0.53,"min":0}]
             * aqi : [{"date":"2017-01-15","max":123,"avg":115,"min":55},{"date":"2017-01-16","max":193,"avg":156.92,"min":119},{"date":"2017-01-17","max":227,"avg":173.38,"min":113},{"date":"2017-01-18","max":194,"avg":163.83,"min":146},{"date":"2017-01-19","max":227,"avg":96.54,"min":7}]
             * humidity : [{"date":"2017-01-15","max":0.93,"avg":0.86,"min":0.47},{"date":"2017-01-16","max":0.89,"avg":0.75,"min":0.43},{"date":"2017-01-17","max":0.92,"avg":0.58,"min":0.2},{"date":"2017-01-18","max":0.48,"avg":0.4,"min":0.22},{"date":"2017-01-19","max":0.57,"avg":0.37,"min":0.18}]
             * astro : [{"date":"2017-01-15","sunset":{"time":"17:11"},"sunrise":{"time":"07:34"}},{"date":"2017-01-16","sunset":{"time":"17:12"},"sunrise":{"time":"07:33"}},{"date":"2017-01-17","sunset":{"time":"17:13"},"sunrise":{"time":"07:33"}},{"date":"2017-01-18","sunset":{"time":"17:14"},"sunrise":{"time":"07:32"}},{"date":"2017-01-19","sunset":{"time":"17:16"},"sunrise":{"time":"07:32"}}]
             * ultraviolet : [{"index":"1","desc":"最弱","datetime":"2017-01-15"},{"index":"4","desc":"强","datetime":"2017-01-16"},{"index":"4","desc":"强","datetime":"2017-01-17"},{"index":"4","desc":"强","datetime":"2017-01-18"},{"index":"3","desc":"中等","datetime":"2017-01-19"}]
             * pm25 : [{"date":"2017-01-15","max":93,"avg":87,"min":36},{"date":"2017-01-16","max":145,"avg":118.92,"min":90},{"date":"2017-01-17","max":176,"avg":131.54,"min":85},{"date":"2017-01-18","max":146,"avg":124.38,"min":112},{"date":"2017-01-19","max":176,"avg":71.71,"min":3}]
             * dressing : [{"index":"8","desc":"极冷","datetime":"2017-01-15"},{"index":"8","desc":"极冷","datetime":"2017-01-16"},{"index":"8","desc":"极冷","datetime":"2017-01-17"},{"index":"8","desc":"极冷","datetime":"2017-01-18"},{"index":"8","desc":"极冷","datetime":"2017-01-19"}]
             * carWashing : [{"index":"2","desc":"较适宜","datetime":"2017-01-15"},{"index":"2","desc":"较适宜","datetime":"2017-01-16"},{"index":"2","desc":"较适宜","datetime":"2017-01-17"},{"index":"2","desc":"较适宜","datetime":"2017-01-18"},{"index":"2","desc":"较适宜","datetime":"2017-01-19"}]
             * precipitation : [{"date":"2017-01-15","max":0,"avg":0,"min":0},{"date":"2017-01-16","max":0,"avg":0,"min":0},{"date":"2017-01-17","max":0,"avg":0,"min":0},{"date":"2017-01-18","max":0,"avg":0,"min":0},{"date":"2017-01-19","max":0,"avg":0,"min":0}]
             * wind : [{"date":"2017-01-15","max":{"direction":184.91,"speed":8.45},"avg":{"direction":147.71,"speed":4.59},"min":{"direction":111.16,"speed":2.52}},{"date":"2017-01-16","max":{"direction":168.15,"speed":8.24},"avg":{"direction":99.51,"speed":3.49},"min":{"direction":125.66,"speed":1.08}},{"date":"2017-01-17","max":{"direction":294.59,"speed":17.67},"avg":{"direction":310.67,"speed":7.04},"min":{"direction":187.47,"speed":0.33}},{"date":"2017-01-18","max":{"direction":347.92,"speed":10.63},"avg":{"direction":345.7,"speed":7.22},"min":{"direction":153.81,"speed":0.83}},{"date":"2017-01-19","max":{"direction":332.25,"speed":23.09},"avg":{"direction":330.81,"speed":12.29},"min":{"direction":42.19,"speed":1.68}}]
             */

            private String status;
            private List<ColdRiskBean> coldRisk;
            private List<TemperatureBeanX> temperature;
            private List<SkyconBeanX> skycon;
            private List<CloudrateBeanX> cloudrate;
            private List<AqiBeanX> aqi;
            private List<HumidityBeanX> humidity;
            private List<AstroBean> astro;
            private List<UltravioletBean> ultraviolet;
            private List<Pm25BeanX> pm25;
            private List<DressingBean> dressing;
            private List<CarWashingBean> carWashing;
            private List<PrecipitationBeanX> precipitation;
            private List<WindBeanX> wind;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public List<ColdRiskBean> getColdRisk() {
                return coldRisk;
            }

            public void setColdRisk(List<ColdRiskBean> coldRisk) {
                this.coldRisk = coldRisk;
            }

            public List<TemperatureBeanX> getTemperature() {
                return temperature;
            }

            public void setTemperature(List<TemperatureBeanX> temperature) {
                this.temperature = temperature;
            }

            public List<SkyconBeanX> getSkycon() {
                return skycon;
            }

            public void setSkycon(List<SkyconBeanX> skycon) {
                this.skycon = skycon;
            }

            public List<CloudrateBeanX> getCloudrate() {
                return cloudrate;
            }

            public void setCloudrate(List<CloudrateBeanX> cloudrate) {
                this.cloudrate = cloudrate;
            }

            public List<AqiBeanX> getAqi() {
                return aqi;
            }

            public void setAqi(List<AqiBeanX> aqi) {
                this.aqi = aqi;
            }

            public List<HumidityBeanX> getHumidity() {
                return humidity;
            }

            public void setHumidity(List<HumidityBeanX> humidity) {
                this.humidity = humidity;
            }

            public List<AstroBean> getAstro() {
                return astro;
            }

            public void setAstro(List<AstroBean> astro) {
                this.astro = astro;
            }

            public List<UltravioletBean> getUltraviolet() {
                return ultraviolet;
            }

            public void setUltraviolet(List<UltravioletBean> ultraviolet) {
                this.ultraviolet = ultraviolet;
            }

            public List<Pm25BeanX> getPm25() {
                return pm25;
            }

            public void setPm25(List<Pm25BeanX> pm25) {
                this.pm25 = pm25;
            }

            public List<DressingBean> getDressing() {
                return dressing;
            }

            public void setDressing(List<DressingBean> dressing) {
                this.dressing = dressing;
            }

            public List<CarWashingBean> getCarWashing() {
                return carWashing;
            }

            public void setCarWashing(List<CarWashingBean> carWashing) {
                this.carWashing = carWashing;
            }

            public List<PrecipitationBeanX> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<PrecipitationBeanX> precipitation) {
                this.precipitation = precipitation;
            }

            public List<WindBeanX> getWind() {
                return wind;
            }

            public void setWind(List<WindBeanX> wind) {
                this.wind = wind;
            }

            public static class ColdRiskBean {
                /**
                 * index : 4
                 * desc : 极易发
                 * datetime : 2017-01-15
                 */

                private String index;
                private String desc;
                private String datetime;

                public String getIndex() {
                    return index;
                }

                public void setIndex(String index) {
                    this.index = index;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class TemperatureBeanX {
                /**
                 * date : 2017-01-15
                 * max : -2.5
                 * avg : -4
                 * min : -10.03
                 */

                private String date;
                private double max;
                private int avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public int getAvg() {
                    return avg;
                }

                public void setAvg(int avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class SkyconBeanX {
                /**
                 * date : 2017-01-15
                 * value : CLOUDY
                 */

                private String date;
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class CloudrateBeanX {
                /**
                 * date : 2017-01-15
                 * max : 1
                 * avg : 0.81
                 * min : 0.06
                 */

                private String date;
                private int max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public int getMax() {
                    return max;
                }

                public void setMax(int max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class AqiBeanX {
                /**
                 * date : 2017-01-15
                 * max : 123
                 * avg : 115
                 * min : 55
                 */

                private String date;
                private int max;
                private int avg;
                private int min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public int getMax() {
                    return max;
                }

                public void setMax(int max) {
                    this.max = max;
                }

                public int getAvg() {
                    return avg;
                }

                public void setAvg(int avg) {
                    this.avg = avg;
                }

                public int getMin() {
                    return min;
                }

                public void setMin(int min) {
                    this.min = min;
                }
            }

            public static class HumidityBeanX {
                /**
                 * date : 2017-01-15
                 * max : 0.93
                 * avg : 0.86
                 * min : 0.47
                 */

                private String date;
                private double max;
                private double avg;
                private double min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }
            }

            public static class AstroBean {
                /**
                 * date : 2017-01-15
                 * sunset : {"time":"17:11"}
                 * sunrise : {"time":"07:34"}
                 */

                private String date;
                private SunsetBean sunset;
                private SunriseBean sunrise;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public SunsetBean getSunset() {
                    return sunset;
                }

                public void setSunset(SunsetBean sunset) {
                    this.sunset = sunset;
                }

                public SunriseBean getSunrise() {
                    return sunrise;
                }

                public void setSunrise(SunriseBean sunrise) {
                    this.sunrise = sunrise;
                }

                public static class SunsetBean {
                    /**
                     * time : 17:11
                     */

                    private String time;

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }

                public static class SunriseBean {
                    /**
                     * time : 07:34
                     */

                    private String time;

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }
            }

            public static class UltravioletBean {
                /**
                 * index : 1
                 * desc : 最弱
                 * datetime : 2017-01-15
                 */

                private String index;
                private String desc;
                private String datetime;

                public String getIndex() {
                    return index;
                }

                public void setIndex(String index) {
                    this.index = index;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class Pm25BeanX {
                /**
                 * date : 2017-01-15
                 * max : 93
                 * avg : 87
                 * min : 36
                 */

                private String date;
                private int max;
                private int avg;
                private int min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public int getMax() {
                    return max;
                }

                public void setMax(int max) {
                    this.max = max;
                }

                public int getAvg() {
                    return avg;
                }

                public void setAvg(int avg) {
                    this.avg = avg;
                }

                public int getMin() {
                    return min;
                }

                public void setMin(int min) {
                    this.min = min;
                }
            }

            public static class DressingBean {
                /**
                 * index : 8
                 * desc : 极冷
                 * datetime : 2017-01-15
                 */

                private String index;
                private String desc;
                private String datetime;

                public String getIndex() {
                    return index;
                }

                public void setIndex(String index) {
                    this.index = index;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class CarWashingBean {
                /**
                 * index : 2
                 * desc : 较适宜
                 * datetime : 2017-01-15
                 */

                private String index;
                private String desc;
                private String datetime;

                public String getIndex() {
                    return index;
                }

                public void setIndex(String index) {
                    this.index = index;
                }

                public String getDesc() {
                    return desc;
                }

                public void setDesc(String desc) {
                    this.desc = desc;
                }

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }
            }

            public static class PrecipitationBeanX {
                /**
                 * date : 2017-01-15
                 * max : 0
                 * avg : 0
                 * min : 0
                 */

                private String date;
                private int max;
                private int avg;
                private int min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public int getMax() {
                    return max;
                }

                public void setMax(int max) {
                    this.max = max;
                }

                public int getAvg() {
                    return avg;
                }

                public void setAvg(int avg) {
                    this.avg = avg;
                }

                public int getMin() {
                    return min;
                }

                public void setMin(int min) {
                    this.min = min;
                }
            }

            public static class WindBeanX {
                /**
                 * date : 2017-01-15
                 * max : {"direction":184.91,"speed":8.45}
                 * avg : {"direction":147.71,"speed":4.59}
                 * min : {"direction":111.16,"speed":2.52}
                 */

                private String date;
                private MaxBean max;
                private AvgBean avg;
                private MinBean min;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public MaxBean getMax() {
                    return max;
                }

                public void setMax(MaxBean max) {
                    this.max = max;
                }

                public AvgBean getAvg() {
                    return avg;
                }

                public void setAvg(AvgBean avg) {
                    this.avg = avg;
                }

                public MinBean getMin() {
                    return min;
                }

                public void setMin(MinBean min) {
                    this.min = min;
                }

                public static class MaxBean {
                    /**
                     * direction : 184.91
                     * speed : 8.45
                     */

                    private double direction;
                    private double speed;

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }
                }

                public static class AvgBean {
                    /**
                     * direction : 147.71
                     * speed : 4.59
                     */

                    private double direction;
                    private double speed;

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }
                }

                public static class MinBean {
                    /**
                     * direction : 111.16
                     * speed : 2.52
                     */

                    private double direction;
                    private double speed;

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }
                }
            }
        }
    }
}
