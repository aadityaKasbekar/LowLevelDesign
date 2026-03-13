from typing import Any, Dict
import threading

class SingletonMeta(type):

  _instances: Dict[Any, Any] ={}
  _lock = threading.Lock()

  def __call__(cls, *args: Any, **kwargs: Any) -> Any:
    if cls not in cls._instances:
      with cls._lock:
        if cls not in cls._instances:
          cls._instances[cls] = super().__call__(*args, **kwargs)
    return cls._instances[cls]
