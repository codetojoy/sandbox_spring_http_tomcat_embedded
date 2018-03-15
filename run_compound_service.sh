
APP=CompoundService
WORK_DIR=work/compound
PORT=5153 

# --------------------------------

ROOT_DIR=$PWD
gradle :ServiceRunner:build

gradle :${APP}:war

mkdir -p $WORK_DIR
rm -rf $WORK_DIR
mkdir -p $WORK_DIR
cd $WORK_DIR

cp $ROOT_DIR/ServiceRunner/build/libs/ServiceRunner-all.jar .
cp $ROOT_DIR/${APP}/build/libs/${APP}.war .

java -jar ServiceRunner-all.jar ${PORT} ${APP} ${APP}.war
