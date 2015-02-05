/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2015/2/5 17:35:41                            */
/*==============================================================*/


alter table menu_dish
   drop primary key;

drop table if exists menu_dish;

alter table menu_formula
   drop primary key;

drop table if exists menu_formula;

alter table menu_formula_info
   drop primary key;

drop table if exists menu_formula_info;

alter table menu_info
   drop primary key;

drop table if exists menu_info;

alter table menu_type
   drop primary key;

drop table if exists menu_type;

alter table menu_user_order
   drop primary key;

drop table if exists menu_user_order;

alter table menu_user_order_item
   drop primary key;

drop table if exists menu_user_order_item;

alter table user_info
   drop primary key;

drop table if exists user_info;

/*==============================================================*/
/* User: dinner                                                 */
/*==============================================================*/
create user dinner;

/*==============================================================*/
/* Table: menu_dish                                             */
/*==============================================================*/
create table menu_dish
(
   id                   int not null,
   menuid               int not null comment '菜单id:menu表',
   typeid               int not null comment '菜单类型id:menutype表',
   name                 varchar(20) not null comment '菜名',
   unit                 varchar(20) comment '单位',
   price                float not null default 0 comment '价格',
   remark               varchar(40) comment '备注'
);

alter table menu_dish comment '每道菜的信息';

alter table menu_dish
   add primary key (id);

/*==============================================================*/
/* Table: menu_formula                                          */
/*==============================================================*/
create table menu_formula
(
   id                   int not null,
   formulainfoid        int not null,
   menu_type            int not null
);

alter table menu_formula
   add primary key (id);

/*==============================================================*/
/* Table: menu_formula_info                                     */
/*==============================================================*/
create table menu_formula_info
(
   id                   int not null,
   price                float not null comment '价格',
   remark               varchar(50) comment '备注',
   menuid               int not null comment '本计价公式适用于哪个菜单'
);

alter table menu_formula_info comment '菜单计算公式基本信息';

alter table menu_formula_info
   add primary key (id);

/*==============================================================*/
/* Table: menu_info                                             */
/*==============================================================*/
create table menu_info
(
   id                   int not null,
   name                 varchar(20) not null,
   remark               varchar(20) comment '备注信息',
   status               int not null default 0 comment '0未开始、1可以点餐、2已下单'
);

alter table menu_info comment '菜单，含多道菜';

alter table menu_info
   add primary key (id);

/*==============================================================*/
/* Table: menu_type                                             */
/*==============================================================*/
create table menu_type
(
   id                   int not null,
   name                 varchar(20) not null
);

alter table menu_type comment '菜的类型：荤菜、素菜、单点、赠品、团购';

alter table menu_type
   add primary key (id);

/*==============================================================*/
/* Table: menu_user_order                                       */
/*==============================================================*/
create table menu_user_order
(
   id                   int not null,
   userid               int not null,
   booktime             datetime not null comment '最后修正时间',
   pricetotal           float not null default 0 comment '总价',
   itemtotal            varchar(200) not null comment '都点了什么菜的字符串',
   menuid               int not null
);

alter table menu_user_order comment '用户订单';

alter table menu_user_order
   add primary key (id);

/*==============================================================*/
/* Table: menu_user_order_item                                  */
/*==============================================================*/
create table menu_user_order_item
(
   id                   int not null,
   userorderid          int not null,
   dishid               int not null
);

alter table menu_user_order_item comment '用户订单明细';

alter table menu_user_order_item
   add primary key (id);

/*==============================================================*/
/* Table: user_info                                             */
/*==============================================================*/
create table user_info
(
   id                   int not null,
   name                 varchar(20) not null comment '登录名',
   pw                   varchar(20) not null comment '密码',
   phone                varchar(15) comment '手机',
   email                varchar(50) comment '邮箱',
   registtime           datetime
);

alter table user_info
   add primary key (id);

