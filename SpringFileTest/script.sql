

-- 게시판 + 파일 업로드(1개)
create table tblFileBoard (
    seq number primary key,                 --pk
    subject varchar2(100) not null,         --제목
    name varchar2(30) not null,             --작성자
    regdate date default sysdate not null,  --작성일
    filename varchar2(100) null,            --파일명(저장)
    orgfilename varchar2(100) null          --파일명(원본)
);

create sequence seqFileBoard;