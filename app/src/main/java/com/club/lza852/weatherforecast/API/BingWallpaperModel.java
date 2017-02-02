package com.club.lza852.weatherforecast.API;

/**
 * Created by lei on 17-1-30.
 */

public class BingWallpaperModel {

    /**
     * data : {"id":337,"title":"大年三十","attribute":"我回来了","description":"又一年除夕，该是家家团圆家家庆祝了吧。象征年味的物什不少，红灯笼红对联，穿新衣戴新帽。而唯有这筷子和蒸笼，将年味与\u201c民以食为天\u201d的韵味相结合，这其中，有启迪，有传承，有明礼，有关爱，千般感情万般寄托，都凝聚在桌上这一双和这一屉上了。","startdate":"20170126","enddate":"20170127","fullstartdate":"201701261600","url":"http://s.cn.bing.net/az/hprichbg/rb/Chopstics_ZH-CN11978203109_1920x1080.jpg","urlbase":"/az/hprichbg/rb/Chopstics_ZH-CN11978203109","copyright":"红筷子和蒸笼，中国 (© Dudley Wood/Alamy Stock Photo)","copyrightlink":"http://www.bing.com/search?q=%E4%B8%AD%E5%9B%BD%E7%AD%B7%E5%AD%90&form=hpcapt&mkt=zh-cn","hsh":"8e9f237a00eba3168380ff8f9d779298","qiniu_url":"Chopstics_ZH-CN11978203109","longitude":"","latitude":"","city":"","country":"","continent":"亚洲","thumbnail_pic":"http://ww3.sinaimg.cn/thumbnail/006qRazejw1fc4xmaz9d9j30sg0g0jyv.jpg","bmiddle_pic":"http://ww3.sinaimg.cn/bmiddle/006qRazejw1fc4xmaz9d9j30sg0g0jyv.jpg","original_pic":"http://ww3.sinaimg.cn/large/006qRazejw1fc4xmaz9d9j30sg0g0jyv.jpg","weibo":1}
     * status : {"code":200,"message":""}
     */

    private DataBean data;
    private StatusBean status;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public StatusBean getStatus() {
        return status;
    }

    public void setStatus(StatusBean status) {
        this.status = status;
    }

    public static class DataBean {
        /**
         * id : 337
         * title : 大年三十
         * attribute : 我回来了
         * description : 又一年除夕，该是家家团圆家家庆祝了吧。象征年味的物什不少，红灯笼红对联，穿新衣戴新帽。而唯有这筷子和蒸笼，将年味与“民以食为天”的韵味相结合，这其中，有启迪，有传承，有明礼，有关爱，千般感情万般寄托，都凝聚在桌上这一双和这一屉上了。
         * startdate : 20170126
         * enddate : 20170127
         * fullstartdate : 201701261600
         * url : http://s.cn.bing.net/az/hprichbg/rb/Chopstics_ZH-CN11978203109_1920x1080.jpg
         * urlbase : /az/hprichbg/rb/Chopstics_ZH-CN11978203109
         * copyright : 红筷子和蒸笼，中国 (© Dudley Wood/Alamy Stock Photo)
         * copyrightlink : http://www.bing.com/search?q=%E4%B8%AD%E5%9B%BD%E7%AD%B7%E5%AD%90&form=hpcapt&mkt=zh-cn
         * hsh : 8e9f237a00eba3168380ff8f9d779298
         * qiniu_url : Chopstics_ZH-CN11978203109
         * longitude :
         * latitude :
         * city :
         * country :
         * continent : 亚洲
         * thumbnail_pic : http://ww3.sinaimg.cn/thumbnail/006qRazejw1fc4xmaz9d9j30sg0g0jyv.jpg
         * bmiddle_pic : http://ww3.sinaimg.cn/bmiddle/006qRazejw1fc4xmaz9d9j30sg0g0jyv.jpg
         * original_pic : http://ww3.sinaimg.cn/large/006qRazejw1fc4xmaz9d9j30sg0g0jyv.jpg
         * weibo : 1
         */

        private int id;
        private String title;
        private String attribute;
        private String description;
        private String startdate;
        private String enddate;
        private String fullstartdate;
        private String url;
        private String urlbase;
        private String copyright;
        private String copyrightlink;
        private String hsh;
        private String qiniu_url;
        private String longitude;
        private String latitude;
        private String city;
        private String country;
        private String continent;
        private String thumbnail_pic;
        private String bmiddle_pic;
        private String original_pic;
        private int weibo;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAttribute() {
            return attribute;
        }

        public void setAttribute(String attribute) {
            this.attribute = attribute;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getStartdate() {
            return startdate;
        }

        public void setStartdate(String startdate) {
            this.startdate = startdate;
        }

        public String getEnddate() {
            return enddate;
        }

        public void setEnddate(String enddate) {
            this.enddate = enddate;
        }

        public String getFullstartdate() {
            return fullstartdate;
        }

        public void setFullstartdate(String fullstartdate) {
            this.fullstartdate = fullstartdate;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrlbase() {
            return urlbase;
        }

        public void setUrlbase(String urlbase) {
            this.urlbase = urlbase;
        }

        public String getCopyright() {
            return copyright;
        }

        public void setCopyright(String copyright) {
            this.copyright = copyright;
        }

        public String getCopyrightlink() {
            return copyrightlink;
        }

        public void setCopyrightlink(String copyrightlink) {
            this.copyrightlink = copyrightlink;
        }

        public String getHsh() {
            return hsh;
        }

        public void setHsh(String hsh) {
            this.hsh = hsh;
        }

        public String getQiniu_url() {
            return qiniu_url;
        }

        public void setQiniu_url(String qiniu_url) {
            this.qiniu_url = qiniu_url;
        }

        public String getLongitude() {
            return longitude;
        }

        public void setLongitude(String longitude) {
            this.longitude = longitude;
        }

        public String getLatitude() {
            return latitude;
        }

        public void setLatitude(String latitude) {
            this.latitude = latitude;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getContinent() {
            return continent;
        }

        public void setContinent(String continent) {
            this.continent = continent;
        }

        public String getThumbnail_pic() {
            return thumbnail_pic;
        }

        public void setThumbnail_pic(String thumbnail_pic) {
            this.thumbnail_pic = thumbnail_pic;
        }

        public String getBmiddle_pic() {
            return bmiddle_pic;
        }

        public void setBmiddle_pic(String bmiddle_pic) {
            this.bmiddle_pic = bmiddle_pic;
        }

        public String getOriginal_pic() {
            return original_pic;
        }

        public void setOriginal_pic(String original_pic) {
            this.original_pic = original_pic;
        }

        public int getWeibo() {
            return weibo;
        }

        public void setWeibo(int weibo) {
            this.weibo = weibo;
        }
    }

    public static class StatusBean {
        /**
         * code : 200
         * message :
         */

        private int code;
        private String message;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
