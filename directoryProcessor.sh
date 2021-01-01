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

if [ $# -le 2 ]; then
  display_usage
  exit 1
fi

if [ ! -d "directory" ]; then
  echo "error! directory missing at: $directory, script will exit!"
  exit 1
fi

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

#todo analytics should be performed on the WHOLE DIRECTORY.
analytics() {
  tr -d c "$option" < "$directory" | awk '{ print length; }'
}

delete() {
  regex_number='^[0-9]+$'
  if ! [[ $option =~ $regex_number ]]; then
    echo "error: option is not a number"
    exit 1
  fi
  find "$directory" -type -f -size +"$option" -delete
}

arrange() {
  echo
}
