#!/bin/bash
#Atypon Training Shell scripting Assignment

explanation="The first argument is the name of the directory that processing will happen recursively.
The second and third arguments have 3 possibilities:
-ana: analytics   option:   regex to count.
-del: delete      option:   biggest file size (Files larger will deleted).
-arr: arrange     option:   file type (to arrange in one new directory)."

directory=${1}
operation=${2}
option=${3}

display_usage() {
  echo 'Usage: ./directoryProcessor <directory> <operation> <option>'
  echo "$explanation"
}

#if number of arguments is less than or equals to 2 usage is printed, script exits with code 1.
if [ $# -le 2 ]; then
  display_usage
  exit 1
fi

#if directory provided doesn't exist, error is printed & script exits with code 1.
if [ ! -d "$directory" ]; then
  echo "error! directory missing at: $directory, script will exit!"
  exit 1
fi

#todo doesn't work.
analytics() {
  find . -name $option | wc -l
}

delete() {
  regex_number='^[0-9]+$'
  if ! [[ $option =~ $regex_number ]]; then
    echo "error! option is not a number, script will exit!"
    exit 1
  fi
  find $directory -type -f -size +$option -delete
}

#todo doesn't work.
arrange() {
  if [ ! -d $directory/$option/ ]; then
    mkdir $directory/$option/
  fi
  mv *.$option $directory/$option/
}

if [ "$operation" == 'ana' ]; then
  analytics
elif [ "$operation" == 'del' ]; then
  delete
elif [ "$operation" == 'arr' ]; then
  arrange
else
  echo 'error! incorrect operation, script will exit!'
  exit 1
fi
