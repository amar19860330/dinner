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
   menuid               int not null comment '�˵�id:menu��',
   typeid               int not null comment '�˵�����id:menutype��',
   name                 varchar(20) not null comment '����',
   unit                 varchar(20) comment '��λ',
   price                float not null default 0 comment '�۸�',
   remark               varchar(40) comment '��ע'
);

alter table menu_dish comment 'ÿ���˵���Ϣ';

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
   price                float not null comment '�۸�',
   remark               varchar(50) comment '��ע',
   menuid               int not null comment '���Ƽ۹�ʽ�������ĸ��˵�'
);

alter table menu_formula_info comment '�˵����㹫ʽ������Ϣ';

alter table menu_formula_info
   add primary key (id);

/*==============================================================*/
/* Table: menu_info                                             */
/*==============================================================*/
create table menu_info
(
   id                   int not null,
   name                 varchar(20) not null,
   remark               varchar(20) comment '��ע��Ϣ',
   status               int not null default 0 comment '0δ��ʼ��1���Ե�͡�2���µ�'
);

alter table menu_info comment '�˵����������';

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

alter table menu_type comment '�˵����ͣ���ˡ��زˡ����㡢��Ʒ���Ź�';

alter table menu_type
   add primary key (id);

/*==============================================================*/
/* Table: menu_user_order                                       */
/*==============================================================*/
create table menu_user_order
(
   id                   int not null,
   userid               int not null,
   booktime             datetime not null comment '�������ʱ��',
   pricetotal           float not null default 0 comment '�ܼ�',
   itemtotal            varchar(200) not null comment '������ʲô�˵��ַ���',
   menuid               int not null
);

alter table menu_user_order comment '�û�����';

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

alter table menu_user_order_item comment '�û�������ϸ';

alter table menu_user_order_item
   add primary key (id);

/*==============================================================*/
/* Table: user_info                                             */
/*==============================================================*/
create table user_info
(
   id                   int not null,
   name                 varchar(20) not null comment '��¼��',
   pw                   varchar(20) not null comment '����',
   phone                varchar(15) comment '�ֻ�',
   email                varchar(50) comment '����',
   registtime           datetime
);

alter table user_info
   add primary key (id);

