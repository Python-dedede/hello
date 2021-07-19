#!/bin/bash

source ~/.bash_profile

bin=`dirname "$0"`
bin=`cd "$bin";pwd`

echo 'workspace is '$bin

export WORKDIR=${bin}

for f in ${WORKDIR}/../libs/*.jar;do
  CLASSPATH=${CLASSPATH}:$f;
done
CLASSPATH=${WORKDIR}/../conf/:${CLASSPATH}
echo ${CLASSPATH}

if [ '$JAVA_HOME' = '' ];then
  echo 'must set JAVA_HOME'
  exit 1
fi


$JAVA_HOME/bin/java -cp $CLASSPATH -DWORKDIR=${WORKDIR} cn.me.java.DemoSpringbootApplication
