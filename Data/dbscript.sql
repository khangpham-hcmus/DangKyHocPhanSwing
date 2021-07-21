drop database if exists `dkhp`;
create database `dkhp`;
use `dkhp`;

drop table if exists `Hocki`;
create table `Hocki`
(
	mahk varchar(6),
    tenhk varchar(3),
    namhoc varchar(4),
    ngaybd varchar(10),
    ngaykt varchar(10),
    constraint pk_hocki primary key(`mahk`)
);

drop table if exists `Monhoc`;
create table `Monhoc`(
	mamh varchar(8),
    tenmh varchar(50),
    sotinchi int,
    constraint pk_monhoc primary key(mamh)
);

drop table if exists `Hocphan`;
create table `Hocphan`(
    mamh varchar(8),
	malop varchar(6),
    mahk	 varchar(6),
    gvlt varchar(50),
    cahoc int,
    phonghoc varchar(4),
    ngayhoc int,
    constraint pk_hocphan primary key(mamh,malop,mahk)
);

drop table if exists `Lophoc`;
create table `Lophoc`
(
	malop varchar(6),
    constraint pk_lophoc primary key (malop)
);

drop table if exists `Sinhvienhocphan`;
create table `Sinhvienhocphan`
(
	masv varchar(10),
    mamh varchar(8),
	malop varchar(6),
    mahk	 varchar(6),
    constraint pk_sinhvienhocphan primary key(masv,mamh,malop,mahk)
);	

drop table if exists `Taikhoan`;
create table `Taikhoan`
(
	cmnd varchar(10),
    matkhau varchar(50),
    loaitaikhoan int,
    constraint pk_taikhoan primary key(cmnd)
);

drop table if exists `Giaovu`;
create table `Giaovu`
(
	magiaovu varchar(10),
    hoten varchar(50),
    cmnd varchar(10),
    constraint pk_giaovu primary key(magiaovu)
);

drop table if exists `Sinhvien`;
create table `Sinhvien`
(
	masv varchar(10),
    malop varchar(6),
    hoten varchar(50),
    gioitinh varchar(3),
    cmnd varchar(50),
    constraint pk_sinhvien primary key (masv)
);

/*foreign key*/
alter table `Giaovu`
add constraint fk_giaovu_taikhoan
foreign key (cmnd)
references Taikhoan(cmnd);

alter table `Sinhvien`
add constraint  fk_sinhvien_taikhoan
foreign key (cmnd)
references Taikhoan(cmnd);

alter table  `Sinhvien`
add constraint fk_sinhvien_lophoc
foreign key (malop)
references Lophoc(malop);

alter table `Hocphan`
add constraint fk_hocphan_monhoc
foreign key (mamh)
references Monhoc(mamh);

alter table `Hocphan`
add constraint fk_hocphan_hocki
foreign key (mahk)
references Hocki(mahk);

alter table `Hocphan`
add constraint fk_hocphan_lophoc
foreign key (malop)
references Lophoc(malop);

alter table `Sinhvienhocphan`
add constraint fk_sinhvienhocphan_sinhvien
foreign key (masv)
references sinhvien(masv);

alter table `Sinhvienhocphan`
add constraint fk_sinhvienhocphan_hocphan_mmh
foreign key (mamh)
references hocphan(mamh);

alter table `Sinhvienhocphan`
add constraint fk_sinhvienhocphan_hocphan_ml
foreign key (malop)
references hocphan(malop);

alter table `Sinhvienhocphan`
add constraint fk_sinhvienhocphan_hocphan_mhk
foreign key (mahk)
references hocphan(mahk);



/*insert data*/

insert into hocki values("201701","hk1","2017","01/01/2017","01/05/2017");
insert into hocki values("201702","hk2","2017","15/05/2017","15/09/2017");
insert into hocki values("201801","hk1","2018","01/01/2018","15/09/2018");
insert into hocki values("201802","hk2","2018","15/05/2018","15/09/2018");

insert into monhoc values ("CSC10003","Lap trinh huong doi tuong",4);
insert into monhoc values ("CSC10009","Cau truc du lieu",4);
insert into monhoc values ("CSC10008","He thong may tinh",4);

insert into taikhoan values("312311111","123456",1);
insert into taikhoan values("312311112","123456",2);
insert into taikhoan values("312311113","123456",1);
insert into taikhoan values("312311114","123456",2);

insert into giaovu values("GV001","Ho Tuan Thanh","312311111");
insert into giaovu values("GV002","Nguyen Van Khiet","312311113");

insert into lophoc values("17ctt1");
insert into lophoc values("17ctt2");
insert into lophoc values("17ctt3");

insert into sinhvien values("1712500","17ctt1","pham vo hoang khang","nam","312311112");
insert into sinhvien values("1712501","17ctt1","phan tan khoa","nam","312311114");

insert into hocphan values("CSC10003","17ctt1","201701","Thai Hung Van",1,"e101",2);
insert into hocphan values("CSC10009","17ctt1","201701","Tran Quang Huy",1,"e102",3);

insert into Sinhvienhocphan values("1712500","CSC10003","17ctt1","201701");
insert into sinhvienhocphan values("1712501","CSC10003","17ctt1","201701");
















