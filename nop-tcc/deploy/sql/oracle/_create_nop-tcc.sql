
CREATE TABLE nop_tcc_branch_record(
  BRANCH_ID VARCHAR2(50) NOT NULL ,
  TXN_ID VARCHAR2(50) NOT NULL ,
  BRANCH_NO INTEGER NOT NULL ,
  PARENT_BRANCH_ID VARCHAR2(50)  ,
  STATUS INTEGER NOT NULL ,
  EXPIRE_TIME TIMESTAMP NOT NULL ,
  SERVICE_NAME VARCHAR2(200) NOT NULL ,
  SERVICE_METHOD VARCHAR2(200)  ,
  CONFIRM_METHOD VARCHAR2(200)  ,
  CANCEL_METHOD VARCHAR2(200)  ,
  REQUEST_DATA CLOB  ,
  ERROR_CODE VARCHAR2(200)  ,
  ERROR_MESSAGE VARCHAR2(1000)  ,
  ERROR_STACK VARCHAR2(1000)  ,
  BEGIN_TIME TIMESTAMP NOT NULL ,
  END_TIME TIMESTAMP  ,
  COMMIT_ERROR_CODE VARCHAR2(200)  ,
  COMMIT_ERROR_MESSAGE VARCHAR2(1000)  ,
  COMMIT_ERROR_STACK VARCHAR2(1000)  ,
  CANCEL_ERROR_CODE VARCHAR2(200)  ,
  CANCEL_ERROR_MESSAGE VARCHAR2(1000)  ,
  CANCEL_ERROR_STACK VARCHAR2(1000)  ,
  RETRY_TIMES INTEGER  ,
  MAX_RETRY_TIMES INTEGER NOT NULL ,
  NEXT_RETRY_TIME TIMESTAMP  ,
  VERSION INTEGER NOT NULL ,
  CREATE_TIME TIMESTAMP NOT NULL ,
  UPDATE_TIME TIMESTAMP NOT NULL ,
  constraint PK_nop_tcc_branch_record primary key (BRANCH_ID)
);

CREATE TABLE nop_tcc_record(
  TXN_ID VARCHAR2(50) NOT NULL ,
  TXN_GROUP VARCHAR2(50) NOT NULL ,
  TXN_NAME VARCHAR2(128)  ,
  STATUS INTEGER NOT NULL ,
  EXPIRE_TIME TIMESTAMP NOT NULL ,
  APP_ID VARCHAR2(200) NOT NULL ,
  APP_DATA VARCHAR2(2000)  ,
  BEGIN_TIME TIMESTAMP NOT NULL ,
  END_TIME TIMESTAMP  ,
  ERROR_CODE VARCHAR2(200)  ,
  ERROR_MESSAGE VARCHAR2(1000)  ,
  ERROR_STACK VARCHAR2(1000)  ,
  VERSION INTEGER NOT NULL ,
  CREATE_TIME TIMESTAMP NOT NULL ,
  UPDATE_TIME TIMESTAMP NOT NULL ,
  constraint PK_nop_tcc_record primary key (TXN_ID)
);


      COMMENT ON TABLE nop_tcc_branch_record IS 'TCC事务分支记录';
                
      COMMENT ON COLUMN nop_tcc_branch_record.BRANCH_ID IS '事务分支ID';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.TXN_ID IS '事务ID';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.BRANCH_NO IS '事务分支序号';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.PARENT_BRANCH_ID IS '父分支ID';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.STATUS IS '状态';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.EXPIRE_TIME IS '过期时间';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.SERVICE_NAME IS '服务名';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.SERVICE_METHOD IS '服务方法';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.CONFIRM_METHOD IS '确认方法';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.CANCEL_METHOD IS '取消方法';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.REQUEST_DATA IS '请求数据';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.ERROR_CODE IS '错误码';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.ERROR_MESSAGE IS '错误消息';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.ERROR_STACK IS '错误堆栈';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.BEGIN_TIME IS '开始时间';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.END_TIME IS '结束时间';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.COMMIT_ERROR_CODE IS '提交阶段错误码';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.COMMIT_ERROR_MESSAGE IS '提交阶段错误消息';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.COMMIT_ERROR_STACK IS '提交阶段错误堆栈';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.CANCEL_ERROR_CODE IS '取消阶段错误码';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.CANCEL_ERROR_MESSAGE IS '取消阶段错误消息';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.CANCEL_ERROR_STACK IS '取消阶段错误堆栈';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.RETRY_TIMES IS '重试次数';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.MAX_RETRY_TIMES IS '最大重试次数';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.NEXT_RETRY_TIME IS '下次重试时间';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.VERSION IS '数据版本';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.CREATE_TIME IS '创建时间';
                    
      COMMENT ON COLUMN nop_tcc_branch_record.UPDATE_TIME IS '修改时间';
                    
      COMMENT ON TABLE nop_tcc_record IS 'TCC事务记录';
                
      COMMENT ON COLUMN nop_tcc_record.TXN_ID IS '事务ID';
                    
      COMMENT ON COLUMN nop_tcc_record.TXN_GROUP IS '事务分组';
                    
      COMMENT ON COLUMN nop_tcc_record.TXN_NAME IS '事务名';
                    
      COMMENT ON COLUMN nop_tcc_record.STATUS IS '状态';
                    
      COMMENT ON COLUMN nop_tcc_record.EXPIRE_TIME IS '过期时间';
                    
      COMMENT ON COLUMN nop_tcc_record.APP_ID IS '应用ID';
                    
      COMMENT ON COLUMN nop_tcc_record.APP_DATA IS '应用数据';
                    
      COMMENT ON COLUMN nop_tcc_record.BEGIN_TIME IS '开始时间';
                    
      COMMENT ON COLUMN nop_tcc_record.END_TIME IS '结束时间';
                    
      COMMENT ON COLUMN nop_tcc_record.ERROR_CODE IS '错误码';
                    
      COMMENT ON COLUMN nop_tcc_record.ERROR_MESSAGE IS '错误消息';
                    
      COMMENT ON COLUMN nop_tcc_record.ERROR_STACK IS '错误堆栈';
                    
      COMMENT ON COLUMN nop_tcc_record.VERSION IS '数据版本';
                    
      COMMENT ON COLUMN nop_tcc_record.CREATE_TIME IS '创建时间';
                    
      COMMENT ON COLUMN nop_tcc_record.UPDATE_TIME IS '修改时间';
                    
