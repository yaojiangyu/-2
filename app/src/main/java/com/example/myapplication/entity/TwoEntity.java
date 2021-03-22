package com.example.myapplication.entity;

import java.util.List;

public class TwoEntity {

    /**
     * message : 二级类目获取成功
     * code : 0000
     * success : true
     * entity : [{"id":81,"opt_id":305,"parent_opt_id":14,"opt_name":"套装","level":2,"image":"/upload/mavendemo/teacher/20181022/1540193832893333187.png"},{"id":86,"opt_id":502,"parent_opt_id":14,"opt_name":"大码女装","level":2,"image":"/upload/mavendemo/teacher/20180807/1533634350562074992.png"},{"id":89,"opt_id":1689,"parent_opt_id":14,"opt_name":"牛仔裤","level":2,"image":"/upload/mavendemo/teacher/20180807/1533634396730763906.png"},{"id":1768,"opt_id":2715,"parent_opt_id":14,"opt_name":"针织毛衣","level":2,"image":"/upload/mavendemo/teacher/20181022/1540194197521750063.png"},{"id":1830,"opt_id":52,"parent_opt_id":14,"opt_name":"裤装","level":2,"image":"/upload/mavendemo/teacher/20181115/1542247411803396387.jpg"},{"id":1892,"opt_id":6168,"parent_opt_id":14,"opt_name":"卫衣绒衫","level":2,"image":"/upload/mavendemo/teacher/20181205/1543973232440056487.jpg"},{"id":1988,"opt_id":487,"parent_opt_id":14,"opt_name":"T恤","level":2,"image":"/upload/mavendemo/teacher/20190221/1550732240834377969.png"},{"id":1994,"opt_id":4742,"parent_opt_id":14,"opt_name":"上衣外套","level":2,"image":"/upload/mavendemo/teacher/20190221/1550736295366868348.jpg"},{"id":2068,"opt_id":557,"parent_opt_id":14,"opt_name":"蕾丝雪纺衫","level":2,"image":"/upload/mavendemo/teacher/20190420/1555730462187590716.jpg"},{"id":2069,"opt_id":1001,"parent_opt_id":14,"opt_name":"衬衫","level":2,"image":"/upload/mavendemo/teacher/20190420/1555730387910773372.jpg"},{"id":2202,"opt_id":485,"parent_opt_id":14,"opt_name":"裙装","level":2,"image":"/upload/mavendemo/teacher/20190923/1569228489621776413.jpg"},{"id":2203,"opt_id":3376,"parent_opt_id":14,"opt_name":"妈妈装","level":2,"image":"/upload/mavendemo/teacher/20190923/1569228828913836592.jpg"},{"id":3061,"opt_id":45,"parent_opt_id":14,"opt_name":"毛呢大衣","level":2,"image":""},{"id":3062,"opt_id":48,"parent_opt_id":14,"opt_name":"皮草","level":2,"image":""},{"id":3063,"opt_id":51,"parent_opt_id":14,"opt_name":"风衣","level":2,"image":""},{"id":3064,"opt_id":315,"parent_opt_id":14,"opt_name":"羽绒服","level":2,"image":""},{"id":3065,"opt_id":997,"parent_opt_id":14,"opt_name":"棉服","level":2,"image":""},{"id":3066,"opt_id":5105,"parent_opt_id":14,"opt_name":"通勤西装","level":2,"image":""},{"id":3075,"opt_id":2701,"parent_opt_id":14,"opt_name":"冬上新","level":2,"image":""}]
     */

    private String message;
    private String code;
    private boolean success;
    private List<EntityDTO> entity;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<EntityDTO> getEntity() {
        return entity;
    }

    public void setEntity(List<EntityDTO> entity) {
        this.entity = entity;
    }

    public static class EntityDTO {
        /**
         * id : 81
         * opt_id : 305
         * parent_opt_id : 14
         * opt_name : 套装
         * level : 2
         * image : /upload/mavendemo/teacher/20181022/1540193832893333187.png
         */

        private int id;
        private int opt_id;
        private int parent_opt_id;
        private String opt_name;
        private int level;
        private String image;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getOpt_id() {
            return opt_id;
        }

        public void setOpt_id(int opt_id) {
            this.opt_id = opt_id;
        }

        public int getParent_opt_id() {
            return parent_opt_id;
        }

        public void setParent_opt_id(int parent_opt_id) {
            this.parent_opt_id = parent_opt_id;
        }

        public String getOpt_name() {
            return opt_name;
        }

        public void setOpt_name(String opt_name) {
            this.opt_name = opt_name;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
}
