DROP TABLE if exists h_crmlistener;
CREATE TABLE h_crmlistener(
id int UNSIGNED NOT NULL auto_increment,
ts TIMESTAMP NOT NULL, 
hs VARCHAR(100) NOT NULL,
incoming int UNSIGNED not null,
total int UNSIGNED not null,
error int UNSIGNED not null,
qSize int UNSIGNED not null,
PRIMARY KEY(id),
UNIQUE INDEX `crm_ts` (ts)
);

INSERT INTO h_crmlistener(ts,hs,incoming,total,error,qSize)
	VALUES(CURRENT_TIMESTAMP,"192.168.1.1",1000,999,0,10000);
INSERT INTO h_crmlistener(ts,hs,incoming,total,error,qSize)
	VALUES(CURRENT_TIMESTAMP+1,"192.168.1.1",2000,1999,0,10000);
INSERT INTO h_crmlistener(ts,hs,incoming,total,error,qSize)
	VALUES(CURRENT_TIMESTAMP+2,"192.168.1.1",3000,2999,0,10000);